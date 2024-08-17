object q2{

  def main(args: Array[String]): Unit = {
    val classifyNumber: Int => String = {
        case n if n < 0 => "Negative number is input"
        case n if n==0 => "Zero is input"
        case n if n % 2 == 0 => "Even number is input"
        case _ => "Odd number is input"
    }

    if (args.length > 0) {
        try {
            val input = args(0).toInt
            val result = classifyNumber(input)
            println(result)
        }
        catch {
            case e: NumberFormatException =>
            println("Please enter a valid integer.")
        }
    } 
    
    else {
        println("Please provide an integer as a command line argument.")
    }

  }

}
