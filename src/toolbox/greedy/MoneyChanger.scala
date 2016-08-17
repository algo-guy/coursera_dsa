package toolbox.greedy

/**
Task. The goal in this problem is to find the minimum number of coins needed to change the input value
(an integer) into coins with denominations 1, 5, and 10.
Input Format. The input consists of a single integer 𝑚.
Constraints. 1 ≤ 𝑚 ≤ 103.
Output Format. Output the minimum number of coins with denominations 1, 5, 10 that changes 𝑚.
  */

object MoneyChanger {

  val coin1=1
  val coin2=5
  val coin3=10

  def main(args: Array[String]): Unit = {
    val sum=999
    println(calculateChange(sum))
  }

  def calculateChange(sum:Int):Int = {
    sum match {
      case 1|5|10 => 1
      case _ => 1 + calculateChange(substractCoin(sum))
    }
  }

  def substractCoin(sum:Int):Int = {
    sum match {
      case _ if sum > 10 => sum-10
      case _ if sum > 5 => sum-5
      case _ if sum > 1 => sum-1
    }
  }

}
