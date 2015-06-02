package com.zhoucy.scalatest

import scala.collection.mutable.ArrayBuffer

object Test2 {
  def main(args: Array[String]): Unit = {
    test3()
  }
  def test1(): Unit = {
    val b = new ArrayBuffer[Int]
    b += 1
    println(b);
    b += (2, 3, 4, 5)
    println(b);
    b ++= Array(6, 7, 8)
    println(b);
    b.trimEnd(5)
    println(b);
    b.insert(2, 6)
    println(b);
    b.insert(2, 7, 8, 9);
    println(b);
    b.remove(2);
    println(b);
    b.remove(2, 3)
    println(b);
    for (i <- 0 until b.length) {
      println(i + ":" + b(i))
    }
    val a = b.toArray
    for (i <- 0 until a.length) {
      println(i + ":" + a(i))
    }
  }
  def test2(): Unit = {
    val a = Array(2, 3, 5, 7, 12)
    val r1 = for (ele <- a) yield 2 * ele
    for (ele <- r1) {
      print(ele + ",")
    }
    println()
    var r2 = for (ele <- a if ele % 2 == 0) yield 2 * ele
    for (ele <- r2) {
      print(ele + ",")
    }
    println()
    var r3 = a.filter(_ % 2 == 0) map (2 * _)
    for (ele <- r3) {
      print(ele + ",")
    }
    println()
    println(a.mkString("<", " , ", ">"))
  }
  def test3(): Unit = {
    val a = ArrayBuffer(1, -2, 3, -4, 2, -9, 11, 12, 34, -2)
    var first = true
    val index = for (i <- 0 until a.length if first || a(i) >= 0) yield {
      if (a(i) < 0) first = false
      i
    }
    for (j <- 0 until index.length) a(j) = a(index(j))
    a.trimEnd(a.length - index.length)
    println(a.mkString(" , "))
    println(a.mkString("<", " , ", ">"))
  }
}