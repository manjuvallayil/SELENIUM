package junit.execises;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class parametertest {
	public String city;
	public int area;
	public parametertest(String city,int area){
	this.city=city;
	this.area=area;
	}

	@Test
	public void testMethod(){
	System.out.println("The City is "+city +" and its area is "+area);
	}
	
	@Parameters
	public static Collection<Object[]> parameter(){
	Object[][] pData=new Object[3][2];
	pData[0][0]="Auckland";
	pData[0][1]=3000000;
	pData[1][0]="Cochin";
	pData[1][1]=4000000;
	pData[2][0]="Wellington";
	pData[2][1]=5000000;
	return Arrays.asList(pData);
	}
	}

