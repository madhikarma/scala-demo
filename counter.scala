//> using scala 3.7.1
//> using option "-J--add-opens=java.base/sun.misc=ALL-UNNAMED"
//> using dep "com.lihaoyi::os-lib:0.11.4"
//> using toolkit 0.5.0

@main 
def countFiles(): Unit = 
  val paths = os.list(os.pwd)
  println(paths)