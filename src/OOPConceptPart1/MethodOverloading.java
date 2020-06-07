package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
		//we can overload main method also
		//same method name with same number of arguments not allowed

	}
	   public static void main(int p) {
		   
	   }
	     public static void main(int q, int h) {
	    	 
	     }
	  //method overloading---when the method name is same with different arguments/input parameters within the same class.
	 public void sum() {  //0 input parame
		 System.out.println("sum method--zero param");
		 
	 }
	    public void sum(double d) {
	    	System.out.println("sum method zero param");
	    	
	    }
	   public void sum(int i) {  //1 input param
		   System.out.println("Sum method --1 input param");
		   System.out.println(i);
		   
	   }
	    public void sum(int k,int l) {  //2 input param
	    	System.out.println("Sum method --2 input param");
	    	System.out.println(k+l);
	    }

}
