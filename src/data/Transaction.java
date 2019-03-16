package data;

public interface Transaction {
	
	public boolean add(Double amount);
	
	public Double getTotalAmount();
	
	public boolean incrementTrans();
	
	public Double getAvgTransAmount();
}
