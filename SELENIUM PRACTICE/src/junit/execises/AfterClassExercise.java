package junit.execises;
import org.junit.AfterClass;
import org.junit.Test;

// USING @AfterClass annotation of JUnit

public class AfterClassExercise {
	@AfterClass
	public static void afterClass(){
	System.out.println("Run after all tests get finished");
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