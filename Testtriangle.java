import org.junit.Assert;
import org.junit.Before; 
import org.junit.Test; 

final class RtriangleProvider {
	public static Rtriangle getRtriangle() {
		Rtriangle triangle = new RTriangleImpl();
		return triangle;
	} 
}

interface Rtriangle {
	 int getApexX1(); 
	 int getApexY1(); 
	 int getApexX2(); 
	 int getApexY2(); 
	 int getApexX3(); 
	 int getApexY3(); 
}

class RTriangleImpl implements Rtriangle {

	public int getApexX1() {
		return 2;
	}
	public int getApexY1() {
		return 2;
	}
	public int getApexX2() {
		return 2;
	}
	public int getApexY2() {
		return 6;
	}
	public int getApexX3() {
		return 5;
	}
	public int getApexY3() {
		return 2;
	}
}

public class Testtriangle {
	 @Before 
	 public void setUp() { 	  
	 } 
	 
	 
	 @Test 
	 public void test() { 
		 Rtriangle triangle = RtriangleProvider.getRtriangle();
		 int ax = triangle.getApexX1();
		 int ay = triangle.getApexY1();
		 int bx =  triangle.getApexX2();
		 int by = triangle.getApexY2();
		 int cx = triangle.getApexX3();
		 int cy = triangle.getApexY3();

		   int abx = bx - ax;
		   int aby = by - ay;
		   int acx = cx - ax;
		   int acy = cy - ay;
		   int scalar = abx*acx + aby*acy;
		   Assert.assertEquals(0, scalar);
		   int vector = abx*acy - aby*acx;
		   Assert.assertTrue(vector != 0);
		   
	 }
}
