package org.bank;

public class GreenBank extends RbiBank {
	
	
	public void saving() {
		
		System.out.println("6percent");
		
		
		}
	
	
	public void current() {
		
		
		System.out.println("7 percent");
		
	}
	
	
	private void GoldLoan() {
		
		System.out.println("10 percent");
	

	}
	
	public static void main(String[] args) {
		
		GreenBank g=new GreenBank();
		
		g.saving();

        g.current();

        g.GoldLoan();

       RbiBank r=new RbiBank();

       r.saving();

       r.current();
		
	}
	
	

}
