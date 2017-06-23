package junit.execises;
import org.junit.Before;
import org.junit.Test;



public class BeforeTestExercise {

	
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
	@Before
	public void beforeTest(){
	System.out.println("Running before each test");
	}
	}