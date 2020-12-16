package com.urepscala.main

import com.urepscala.mylib._
import com.urepscala.a.A
import com.urepscala.ipv6_test.IPv6_test
//import com.urepscala.repository


object Main {

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    //println(msg)
    println(MyLib.myString)
    println(A().msg)
    println(IPv6_test().ip.toString)
  }

  //def msg = s"I am running on ${System.getProperty("java.runtime.version")}"

}
