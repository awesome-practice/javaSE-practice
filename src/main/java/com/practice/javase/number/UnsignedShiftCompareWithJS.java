package com.practice.javase.number;

public class UnsignedShiftCompareWithJS
{
	public static void main(String[] args) {
	    int i=-100;
	    int j=i>>>0;
	    System.out.println(j);//JS: -100>>>0 : 4294967196

		System.out.println(Integer.toUnsignedLong(j));//4294967196
	}
}
