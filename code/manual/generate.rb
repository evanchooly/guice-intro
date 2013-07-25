class Generate
  def initialize(classCount, pkgDepth, depCount)
    @className = "Class#{classCount}"
    @package = Array.new
    for count in 1..pkgDepth
      @package.push("package#{count}")
    end
    decls = Array.new
    for count in 1..depCount
      decls.push("private final services.Service#{count} service#{count} = new services.Service#{count}();")
    end
    @content=<<-END.gsub(/^ {6}/, '')
      package #{@package.join(".")};

      public class #{@className} {
        #{decls.join("\n  ")}

        public #{@className}() {
          //  stuff goes here
        }

        // lots of methods here
      }
    END
  end

  def write
    dirName = "src/main/java/#{@package.join("/")}".chomp
    mkdir(dirName)
    file = File.new("#{dirName}/#{@className}.java", "w")
    file.write(@content)
    file.close
  end

  def mkdir(dir)
    if !File.directory?(dir)
      mkdir(dir.chomp(dir.split("/")[-1]).chomp("/"))
      Dir.mkdir(dir)
    end
  end
end

class Service < Generate
  def initialize(classCount, depCount)
    @className = "Service#{classCount}"
    @package = %w(services)

    decls = Array.new
    for count in 1..depCount
      if count != classCount
        decls.push("private final services.Service#{count} service#{count} = new Service#{count}();")
      end
    end
    @content=<<-END.gsub(/^ {6}/, '')
      package #{@package.join(".")};

      public class #{@className} {
        #{decls.join("\n  ")}

        public #{@className}() {
          //  stuff goes here
        }

        // lots of methods here
      }
    END
  end
end

for serviceCount in 1..100
  created = Generate.new(serviceCount, rand(4) + 1, rand(5)+1)
  created.write
end

for serviceCount in 1..5
  created = Service.new(serviceCount, rand(5)+1)
  created.write
end