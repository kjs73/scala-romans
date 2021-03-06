package com.kjs73.romans

object Romans extends App {
  def roman(arabic: Int): String = {
    if (arabic >= 10) {
      return "X" + roman(arabic - 10)
    }
    if (arabic == 9) {
      return "IX"
    }
    if (arabic >= 5) {
      return "V" + roman(arabic - 5)
    }
    if (arabic == 4) {
      return "IV"
    }
    "I" * arabic;
  }
}
