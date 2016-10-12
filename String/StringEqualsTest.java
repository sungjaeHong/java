package com.tistory.devhong;

public class StringEqualsTest {

	public static void main(String[] args) {
		String strValue1 = "홍성재";
		String strValue2 = "홍성재";
		String strValue3 = new String("홍성재");
		String strValue4 = new String("홍성재");

		if(strValue1 == strValue2){
			System.out.println("strValue1과 strValue2는 참조가 같음.");
		} else {
			System.out.println("strValue1과 strValue2는 참조가 다름.");
		}
		
		if(strValue1 == strValue3){
			System.out.println("strValue1과 strValue3는 참조가 같음.");
		} else {
			System.out.println("strValue1과 strValue3는 참조가 다름.");
		}
		
		if(strValue3 == strValue4){
			System.out.println("strValue3과 strValue4는 참조가 같음.");
		} else {
			System.out.println("strValue3과 strValue4는 참조가 다름.");
		}
		
		if(strValue1.equals(strValue3)){
			System.out.println("strValue1과 strValue3은 값이 같음.");
		} else {
			System.out.println("strValue1과 strValue3은 값이 다름.");
		}
		
	}

}
