package com.skr.app;

import org.testng.annotations.Test;

public class SmokeTest {
	
	@Test (groups = {"smoke","functional"})
	public void Test1(){
		System.out.println("This Test belongs to smoke and functional test group. IOS test execution done");
	}
	
	@Test (groups = {"smoke","functional"})
	public void Test2(){
		System.out.println("This Test belongs to smoke and functional test group. IOS test execution done");
	}
	
	@Test (groups = {"smoke","functional"})
	public void Test3(){
		System.out.println("This Test belongs to smoke and functional test group. IOS test execution done");
	}
	
	@Test (groups = {"smoke","functional"})
	public void Test4(){
		System.out.println("This Test belongs to smoke and functional test group. IOS test execution done");
	}

}
