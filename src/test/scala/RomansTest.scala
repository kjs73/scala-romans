package com.kjs73.romans

import org.scalatest.FunSuite

class RomansTest extends FunSuite {
  test("Romans.roman") {
    assert(Romans.roman(1) === "I")
  }
}
