package com.challenges;

/*
 Java: The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.

Create a function that takes a string and applies the Atbash cipher to it.

Examples
atbash("apple") --> "zkkov"

atbash("Hello world!") --> "Svool dliow!"

atbash("Christmas is the 25th of December") --> "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"

Notes:
Capitalisation should be retained.
Non-alphabetic characters should not be altered.
 */

public class October1stChallenge {
	
	public String atbash(String str) {
		char[] arr = str.toCharArray();
		StringBuilder encode = new StringBuilder();
		for (char i : arr) {
			if (Character.isLetter(i)) {
				int temp = (int)i;
				if (Character.isUpperCase(i)){
					//77
					if (temp > 77) {
						int diff = (90 - temp);
						encode.append(((char)(65 + diff)));
					}else if (temp <= 77) {
						int diff = (temp - 65);
						encode.append(((char)(90 - diff)));
					}
					
				} else {
					//109
					if (temp > 109) {
						int diff = (122 - temp);
						encode.append(((char)(97 + diff)));
					}else if (temp <= 109) {
						int diff = (temp - 97);
						encode.append(((char)(122 - diff)));
					}
					
				}
			} else {
				encode.append(i);
			}
			
//			System.out.println((int)i);
		}
			
		return encode.toString();
	}

}
