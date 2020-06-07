package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);//10020
		
		//data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);//120
		
		//Integer Boolean Character Double
		
		//String to double conversion:
		String y = "21.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);//31.33
		
		//String to  Boolean:
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);//true
		
		//int to string conversion
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		String u = "100A";    //100A is not pure  integer
		Integer.parseInt(u);  //NumberFormateException---For input string:"100A"
		
		
		
		
		

	}

}
