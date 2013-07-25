class Generate
  def initialize(classCount, pkgDepth, depCount)
    @package = Array.new
    for count in 1..pkgDepth
      @package.push("package#{count}")
    end
    decls = Array.new
    for count in 1..depCount
      decls.push("private final Service#{count} service#{count} = new Service#{count}();")
    end
    @content=<<-END.gsub(/^ {6}/, '')
      package #{@package.join(".")};

      import com.antwerkz.guice.AnotherService;
      import com.antwerkz.guice.RoomService;
      import com.antwerkz.guice.SomeService;

      public class Class#{classCount} {
        #{decls.join("\n  ")}

        public Class#{classCount}() {
          //  stuff goes here
        }

        // lots of methods here
      }
    END
  end

  def content
    @content
  end
end

for classCount in 0..4
  created = Generate.new(classCount, rand(4) + 1, rand(5))
  puts created.content
end