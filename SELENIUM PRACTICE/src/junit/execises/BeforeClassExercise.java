package junit.execises;
import org.junit.BeforeClass;
import org.junit.Test;



public class BeforeClassExercise {

	
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
	@BeforeClass
	public static void beforeClass(){
	System.out.println("Running before all tests");
	}
	}