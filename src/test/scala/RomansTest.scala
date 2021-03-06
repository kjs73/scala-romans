package com.kjs73.romans

import org.scalatest.FunSuite

import scala.language.postfixOps

class RomansTest extends FunSuite {
  test("Romans.roman") {
    val roman: List[String] = List("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII",
      "XIV", "XV", "XVI", "XVII", "XVIII")
    val arabic: List[Int] = 1 to roman.length toList;
    for((a,r) <- arabic zip roman) {
      assert(Romans.roman(a) === r)
    }
  }
}
