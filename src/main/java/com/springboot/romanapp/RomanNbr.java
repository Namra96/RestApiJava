package com.springboot.romanapp;



public class RomanNbr {

private final int romNum;   // The number represented by this Roman numeral.



private static int[]    arabNum = { 1000,  900,  500,  400,  100,   90,  
                                      50,   40,   10,    9,    5,    4,    1 };
                                   
private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
                                    "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
   

public RomanNbr(int arabic) {
    
   if (arabic < 1)
      throw new NumberFormatException("Value of RomanNumeral must be positive.");
   if (arabic > 3999)
      throw new NumberFormatException("Value of RomanNumeral must be 3999 or less.");
   romNum = arabic;
}


public String toString() {
     
   String roman = "";  // The roman numeral.
   int N = romNum;        // N represents the part of num that still has
                       //   to be converted to Roman numeral representation.
   for (int i = 0; i < arabNum.length; i++) {
      while (N >= arabNum[i]) {
         roman += letters[i];
         N -= arabNum[i];
      }
   }
   return roman;
}


public int toInt() {
     // Return the value of this Roman numeral as an int.
   return romNum;
}


} 