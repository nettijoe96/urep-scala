package com.urepscala.ipv6_test

import com.softwaremill.macwire
import com.googlecode.ipv6.IPv6Address

case class IPv6_test(ip: IPv6Address = IPv6Address.fromString("2001:0db8:85a3:0000:0000:8a2e:0370:7334"))

// object IPv6_test {
//   def main(args: Array[String]): Unit = {
//     println("Hello, world!")
//   }

// }