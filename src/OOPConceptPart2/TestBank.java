package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(UsBank.min_bal);
		
		HsbcBank hs = new HsbcBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.Carloan();
        hs.mutualfund();
        
		//dynamic polymorphism
		//child class object can be referred by parent interface reference var
		UsBank b = new HsbcBank();
		b.credit();
		b.debit();
		b.transferMoney();
	    
	    
	}

}
