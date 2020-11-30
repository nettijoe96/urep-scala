import com.urepscala.mylib._
import com.urepscala.a.A
import com.urepscala.ipv6_test.IPv6_test
//import com.googlecode.ipv6.IPv6Address


object Main {

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println(msg)
    println(MyLib.myString)
    println(A().msg)
    println(IPv6_test().ip.toString)
    //println(IPv6Address.fromString("2001:0db8:85a3:0000:0000:8a2e:0370:7334").toString)
  }

  def msg = s"I am running on ${System.getProperty("java.runtime.version")}"

}
