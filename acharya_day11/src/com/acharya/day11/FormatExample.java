package com.acharya.day11;

public class FormatExample {

	public static void main(String[] args) {
	   String name = "RCB";
       String sf1 = String.format("%s",name);
       String sf2 = String.format("%s",32.33434);
       String sf3 = String.format("%16.12f",32.33434);
       System.out.println(sf1);
       System.out.println(sf2);
       System.out.println(sf3);
	}

}
