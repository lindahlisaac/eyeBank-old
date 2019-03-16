package data;

import org.springframework.beans.factory.annotation.Autowired;

import transaction.Credit;
import transaction.Debit;

public class Data {
	
	@Autowired
	private Credit credit;
	
	@Autowired
	private Debit debit;
	
	private double totalDiff;
	
	public Data() {
		
	}
	
	/*
	 * Line comes in as
	 * [0] Date
	 * [1] Trans
	 * [2] N/A
	 * [3] N/A
	 * [4] Memo
	 */
	public void initDataElements(String line) {

		System.out.println("Line: " + line);
		
		// if line is credit, call credit.add(transaction)
		
		// if line is debit , call  debit.add(transaction)
		
		 Double total = getTotalDiff(credit, debit);
		
//		System.out.println("Total Account Difference: " + total);
	}
	
	private Double getTotalDiff(Credit credit, Debit debit) {
		return credit.getTotalAmount() - debit.getTotalAmount();
	}
	
	
	

}
