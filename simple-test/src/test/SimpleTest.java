package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.DALOAD;

public class SimpleTest {

	/*
	@Test
	public void testGetTotalRows(){
		BoardDao boardDao = new BoardDao();
		int result = boardDao.getTotalRows();
		Assert.assertEquals(10, result);
	}
	*/
	
	@Before
	public void setup(){
		System.out.println("before");
	}
	
	@After
	public void tearDown(){
		System.out.println("after");
	}
	
	@Test
	public void testOne(){
		System.out.println("testone");
	}
	
	@Test
	public void testTwo(){
		System.out.println("testtwo");
	}
}
