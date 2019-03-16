package transaction;

import java.util.ArrayList;

import data.Transaction;

public class Debit implements Transaction {
	
	private ArrayList<Double> transList = new ArrayList<Double>();
	private Double totalDebits;
	private long numDebits;

	public Debit() {
		
	}
	
	@Override
	public boolean add(Double amount) {
		transList.add(amount);
		updateTotalDebits(transList);
		
		return false;
	}
	
	@Override
	public Double getTotalAmount() {
		return this.totalDebits;
	}
	
	private void updateTotalDebits(ArrayList<Double> transList) {
		Double total = null;
		for(Double d : transList) {
			total += d;
		}
		this.totalDebits = total;
	}

	@Override
	public boolean incrementTrans() {
		++numDebits;
		return false;
	}

	@Override
	public Double getAvgTransAmount() {
		Double avg = (totalDebits/numDebits);
		return avg;
	}

}
