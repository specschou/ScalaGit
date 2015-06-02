package com.zhoucy.scalatest

object Test1 {
  def main(args: Array[String]) { test4() }
  def test1() {
    val s = "Hi";
    println(s);
  }
  def test2(args: Array[String]) {
    var frenchDayOfWeek = args(0) match {
      case "Sunday"    => "Dimanche"
      case "Monday"    => "Lundi"
      case "Tuesday"   => "Mardi"
      case "Wednesday" => "Mercredi"
      case "Thursday"  => "Jeudi"
      case "Friday"    => "Samedi"
      case _           => "Error: '" + args(0) + "' is not a day of the week"
    }
    println(frenchDayOfWeek);
  }
  def test3() {
    val s = "Hello"
    var sum1 = 0
    for (i <- 0 until s.length) {
      sum1 += s(i)
    }
    println(sum1);
    var sum2 = 0
    for (ch <- s) {
      sum2 += ch
    }
    println(sum2)
    for (i <- 1 to 3; j <- -1 to 3) print((10 * i + j) + " ")
  }
  def test4() {
    println(sum(12, 13));
  }
  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }
}