package com.test.automation;

import static org.junit.Assert.*;

import org.junit.Test;

class SimpleClass{
	public int sumArray(int[] num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}
}

public class FirstJunitTest {
	SimpleClass sim1=new SimpleClass();

	@Test
	public void test() {
		
		int actResult=sim1.sumArray(new int[] {10,20,30});
		System.out.println(actResult);
		assertEquals(actResult, 60);
		
	}
	
	@Test
	public void test1() {
		
		int actResult=sim1.sumArray(new int[] {10,20});
		System.out.println(actResult);
		assertEquals(actResult, 30);
		
	}
	
	@Test
	public void test2() {
		
		int actResult=sim1.sumArray(new int[] {});
		System.out.println(actResult);
		assertEquals(actResult, 0);
	}
	
	@Test
	public void test3() {
		
		int actResult=sim1.sumArray(new int[] {10,10,10,10,10});
		System.out.println(actResult);
		assertEquals(actResult, 50);
		
	}
}
