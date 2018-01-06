package com.bhami.switchWithString;

public class SwitchStringExample {
	public  void  switchWithIf(String str){
		if (str.equalsIgnoreCase("red"))
			System.out.println("RED");
		else if (str.equalsIgnoreCase("blue")) 
			System.out.println("BLUE");
	}
	public void switchWithString(String str){
		switch(str){
		case "red":
			System.out.println("RED from switch");
			break;
		case "blue":
			System.out.println("BLUE from switch");
			break;
		default:
			System.out.println("NO COLOR from swtich");
		}
	}
	public static void main(String[] args) {
		SwitchStringExample obj = new SwitchStringExample();
		obj.switchWithIf("blue");
		obj.switchWithString(null);
		
	}

}
