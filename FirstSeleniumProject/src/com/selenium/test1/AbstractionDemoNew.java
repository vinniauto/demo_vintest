package com.selenium.test1;

public class AbstractionDemoNew {

	public static void main(String[] args) {
		VindemoInterfacedemo obj = new VindemoInterfacedemo();
		obj.show();
		obj.bet();
		obj.net();
		obj.pet();
		
		
		VindemoInterfacedemo h = new VindemoInterfacedemo();
		h.bet();
		h.net();
		h.show();
		h.pet();
		
	}
}
