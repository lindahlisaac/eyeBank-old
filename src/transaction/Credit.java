package transaction;

import java.util.ArrayList;

import data.Transaction;

public class Credit implements Transaction {

	private ArrayList<Double> transList = new ArrayList<Double>();
	private float numCredits;
	private Double totalCredits;
	
	public Credit() {
		
	}
	
	@Override
	public boolean add(Double amount) {
		transList.add(amount);
		updateTotalCredits(transList);
		
		return true;
	}
	
	@Override
	public Double getTotalAmount() {
		return this.totalCredits;
	}
	
	public void updateTotalCredits(ArrayList<Double> transList) {
		Double total = null;
		for(Double d : transList) {
			total += d;
		}
		this.totalCredits = total;
	}

	@Override
	public boolean incrementTrans() {
		++numCredits;
		return true;
	}

	@Override
	public Double getAvgTransAmount() {
		Double avg = (totalCredits/numCredits);
		return avg;
	}

}
