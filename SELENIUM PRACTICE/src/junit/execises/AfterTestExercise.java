package junit.execises;
import org.junit.After;
import org.junit.Test;



public class AfterTestExercise {
	@After
	public void afterTest(){
	System.out.println("Running after each test");
	}
	
	@Test
	public void junitTest1(){
	System.out.println("Running First Junit test");
	
	}
	
	@Test
	public void junitTest2(){
	System.out.println("Running Second Junit test");
	
	}
	@Test
	public void junitTest3(){
	System.out.println("Running Third Junit test");
	
	}
	
	}