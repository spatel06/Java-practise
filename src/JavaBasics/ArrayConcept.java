package JavaBasics;

public class ArrayConcept {

	

	public static void main(String[] args) {
		
		//Array: to store similar data types values in a array variable
		//dis advantages of array 
		//1 size is fixed ----static array --to overcome this problem we use collections-- Arraylist, Hashtable use dynamic array
		//store only similar data types--to overcome this problem---we use object array
		
		
		//1.int array:
		//lowest index =0
		//one dim array
		int i[] = new int[4];
		   i[0] = 10;
		   i[1] = 20;
		   i[2] = 30;
		   i[3] = 40;
		   
		   System.out.println(i[2]);
		   System.out.println(i[3]);
		   
		   //i[4] arrayIndexOutOfBoundsException
		   
		   System.out.println(i.length);  //sige/length of Array
		   
		  // print all the values of array:use For Loop
		   for(int j=0;j<i.length;j++) {
			   System.out.println(i[j]);
			   
			  // double array
			   
			   double d[] = new double[3];
			         d[0] = 12.33;
			         d[1] = 13.44;
			         d[2] = 45.55;
			         
			         System.out.println(d[2]);
			         
			         //boolean array
			         boolean b[] = new boolean[2];
			         b[0] = true;
			         b[1] = false;
			         
			         //string array
			         String s[] = new String[3];
			         s[0] = "Test";
			         s[1] = "Hello";
			         s[2] = "World";
			         
			         char c[] = new char[3];
			         c[0] = 'a';
			         c[1] = '1';
			         c[2] = '$';
			         
			         System.out.println(s.length);
			         System.out.println(s[1]);
			         
			         //Object Array: Object is a class ---is use to store different data types values
			         Object ob[] = new Object[6];
			         ob[0] = "Tom";
			         ob[1] = 25;
			         ob[2] = 12.33;
			         ob[3] = "1/1/1990";
			         ob[4] = 'M';
			         ob[5] = "London";
			         
			         System.out.println(ob[5]);
			         System.out.println(ob.length);
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			     
			       
			      
					 
			        
			         
			         
			         
			         
			   
			   
		   }

	}

}
