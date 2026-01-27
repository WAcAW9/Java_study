package com.wacaw.exam01;

public class NumverSystem {
	public static void main(String[] args) {
		int binNumber =0b11010010;
		System.out.println("binNumver : "+binNumber);
		System.out.println();
		
		int hexaNumber =0x12c;
		System.out.println("hexaNumber : "+hexaNumber);
		System.out.println();
		
		String hexaString = Integer.toHexString(binNumber);
		System.out.println("hexaString: "+ hexaString);
		System.out.println();
		
		int decimalNumber=Integer.parseInt(hexaString,16);
		System.out.println("decimalNumber: "+decimalNumber);
		
	}
}
