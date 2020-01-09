package com.skr.app;

import org.testng.annotations.Test;

public class SmokeTest {
	
	@Test (groups = {"smoke","functional"})
	public void Test1(){
		System.out.println("This Test belongs to smoke and functional test group. Test1 execution done");
	}
	
	@Test (groups = {"smoke"})
	public void Test2(){
		System.out.println("This Test belongs to smoke test group. Test2 execution done");
	}
	
	@Test (groups = {"smoke","functional"})
	public void Test3(){
		System.out.println("This Test belongs to smoke and functional test group. Test3 execution done");
	}
	
	@Test (groups = {"smoke","functional"})
	public void Test4(){
		System.out.println("This Test belongs to smoke and functional test group. Test4 execution done");
	}

}
