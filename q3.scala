object StringFormatter {

  val toUpper: String => String = _.toUpperCase

  val toLower: String => String = _.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    println(formatNames(name1)(toUpper)) 

    println(formatNames(name2)(name => 
      name.take(2).toUpperCase + name.drop(2).toLowerCase)) 

    println(formatNames(name3)(toLower)) 

    println(formatNames(name4)(name => 
      name.take(1).toUpperCase + name.drop(1).dropRight(1).toLowerCase + name.takeRight(1).toUpperCase)) // KumarA
  }
}
