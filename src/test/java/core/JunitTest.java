package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {}

	@Before
	public void setUp() throws Exception {}

	@After
	public void tearDown() throws Exception {}

	@Test
	public void Test_01_assertEquals_Positive() {assertEquals("String not the same", "Testing", Junit.s);}
	 

	@Test
	public void Test_02_assertEquals_Negative() {assertEquals("String not the same.", "Testing 6", Junit.s);}

	       
	 

	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {assertEquals("String not the same.", "Testing JUnit 3", Junit.s);}
	       


	@Test
	public void Test_04_AssertSame_Positive() {assertSame("Integer not the same.", 777, Junit.i);}
	       
	 

	@Test
	public void Test_05_AssertSame_Negative() {assertSame("Integer not the same.", 54, Junit.i);}
	       
	 

	@Ignore
	@Test
	public void Test_06_AssertSame_Ignored() {assertSame("Integer not the same.", 56, Junit.i);}
	       


	@Test
	public void Test_07_assertFalse_Positive() {assertFalse("Boolean should be false", Junit.f);}
	       


	@Test
	public void Test_08_assertFalse_Negative() {assertFalse("Boolean should be false", Junit.t);}
	       
	 

	@Test
	public void Test_09_assertTrue_Positive() {assertTrue("Boolean should be true", Junit.t);}
	       
	 

	@Test
	public void Test_10_assertTrue_Negative() {assertTrue("Boolean should be true", Junit.f);}
	      
	

}
