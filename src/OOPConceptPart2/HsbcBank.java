package OOPConceptPart2;

public class HsbcBank implements UsBank,BrazilBank{

	//Is a relationship
	//If a class is implementing any interface,then its mandatory to define /override all the methods of interface
	public void credit() {
		System.out.println("hsbc--credit");
		
	}
    public void debit() {
		  System.out.println("hsbc--debit");
		  
	  }
	 public void transferMoney() {
	    	System.out.println("hsbc--transferMoney");
	    	
	    }
	  public void educationLoan() {
		  System.out.println("hsbc--edu loan");
		  
	  }
	  public void Carloan() {
		  System.out.println("hsbc-- carloan");
	  }
	  public void mutualfund() {
		  System.out.println("hsbc--mutualfund");
	  }
}
