lazy val root = (project in file("."))
  .settings(
    Compile / unmanagedSources / excludeFilter := 
      new FileFilter {
        def accept(f: File) = {
          val name = f.getName
          name == "hello.scala" || name == "counter.scala"
        }
      }
  )