package com.kjs73.romans

object Romans extends App {
  def roman(arabic: Int): String = {
    if (arabic == 5) {
      return "V";
    }
    if (arabic == 4) {
      return "IV"
    }
    "I" * arabic;
  }
}
