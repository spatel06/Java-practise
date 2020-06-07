package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
     
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.divison(30, 10);
		System.out.println(div);
		
		//main method is void --- never return a value
	}
	  //non static methods
      //void--does not return any value
	  //return type = void
	public void test() {  //no input no out put
		System.out.println("test method");
	}
	 //return type int
	public int pqr() {  //no input some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	public String qa() {  //no input some output
		System.out.println("qa method");
		String s = "Selanium";
		
		return s;
		
	}
	  //x,y--input parameters/arguments
	 public int divison(int x,int y) {
		 System.out.println("divison method");
		 int d = x/y;
		 
		 return d;
	 }
	
}     
  
