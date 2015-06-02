package com.zhoucy.scalatest

object Test3 extends App {
  if (args.length > 0) {
    println("hello: " + args(0))
  } else {
    test1()
  }
  def test1(): Unit = {
    println("hi")
  }
}