package com.skr.app;

import org.testng.annotations.Test;

public class MobileTest {

	@Test (groups = {"smoke","functional","mobile"})
	public void IOSTest(){
		System.out.println("This Test belongs to mobile, smoke and functional test group. IOS test execution done");
	}
	
	@Test (groups = {"functional","mobile"})
	public void AndroidTest(){
		System.out.println("This Test belongs to mobile and functional test group. AndroidTest test execution done");
	}
	
	@Test (groups = {"smoke","mobile"})
	public void WindowsTest(){
		System.out.println("This Test belongs to smoke and mobile test group. Windows mobile test execution done");
	}
}
