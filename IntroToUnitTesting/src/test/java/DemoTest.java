/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
	 enum TriangleTypes {
	        Equilateral, Isosceles, Scalene
	    }
	     
	   
	     
	    int     a;
	    int     b;
	    int     c;
	     
	 
	    public Triangle(int a, int b, int c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }
	     
	     
	    public String triangleType() {
	         
	        String  type    = "";
	        String  errMsg  = "";
	         
	        
	         
	        if (a <= 0) {
	            errMsg = "a <= 0";
	        }
	        if (b <= 0) {
	            errMsg = "b <= 0";
	        }
	        if (c <= 0) {
	            errMsg = "c <= 0";
	        }
	         
	       
	         
	        if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
	            errMsg = String.format("not a valid triangle a: " + a + " b: " + b + " c: " + c);
	        }
	         
	        
	         
	        if (errMsg.length() != 0) {
	            type = errMsg;
	        } else {
	            if ((a == b) && (b == c)) {
	                type = TriangleTypes.Equilateral.name();
	            } else if ((a == b) || (b == c) || (c == a)) {
	                type = TriangleTypes.Isosceles.name();
	            } else {
	                type = TriangleTypes.Scalene.name();
	            }   
	        }
	 
	  
	         
	        return type;
	    }
}
