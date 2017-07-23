package com.cliff.test;

import org.junit.BeforeClass;
import org.junit.Test;


import org.junit.Assert;

public class TestOnePlusOne extends TestJenkins {

	@Test
	public void testOnePlusOne(){
		try{

			Assert.assertEquals("Expected Value", 2, onePlusOne());
					
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}
	
}
