object InterestCalculator extends App {
  
  val calculateInterest: Double => Double = (deposit: Double) => deposit match {
    case d if d <= 20000      => d * 0.02
    case d if d <= 200000     => d * 0.04
    case d if d <= 2000000    => d * 0.035
    case d if d > 200000      => d * 0.065
  }

  val deposits = List(15000.0, 50000.0, 500000.0, 2500000.0)

  deposits.foreach { deposit =>
    val interest = calculateInterest(deposit)
    println(s"Deposit: Rs. $deposit, Interest Earned: Rs. $interest")
  }
}
