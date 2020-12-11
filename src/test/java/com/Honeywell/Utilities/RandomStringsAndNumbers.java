package com.Honeywell.Utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringsAndNumbers {

	public static int getRandomNumber(int min, int max) {
		int number = (int) ((Math.random() * (max - min)) + min);
		return number;
	}
	
	public static String randomstring(int Number)
	{
		String randomstring = RandomStringUtils.randomAlphabetic(Number);
		return randomstring;
	}
	
}
