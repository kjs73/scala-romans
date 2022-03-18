package com.kjs73.romans

import org.scalatest.FunSuite

class RomansTest extends FunSuite {
  test("Romans.roman") {
    val arabic: List[Int] = List(1,2,3)
    val roman: List[String] = List("I", "II", "III")
    for((a,r) <- arabic zip roman) {
      assert(Romans.roman(a) === r)
    }
  }
}
