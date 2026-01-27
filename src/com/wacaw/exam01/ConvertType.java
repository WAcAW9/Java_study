package com.wacaw.exam01;

public class ConvertType {

	public static void main(String[] args) {
		// 자동 변환 
		byte byteVal=10;
		short shortVal = byteVal;
		int intVal = shortVal;
		long longVal= intVal;
		float floatVal=longVal;
		double  doubleVal= floatVal;
		
		System.out.println("byteVal: "+byteVal);
		System.out.println("shortVal: "+shortVal);
		System.out.println("intVal: "+intVal);
		System.out.println("longVal: "+longVal);
		System.out.println("floatVal: "+floatVal);
		System.out.println("doubleVal: "+doubleVal);
		
		// char chVal=byteVal;
		
		//명시적 변환
		int i=128;
		byte b=(byte)i;
		
		System.out.println("i: "+i);
		System.out.println("b: "+b);
	}
}
