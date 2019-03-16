package transaction;

public class Line {
	
	private String date;
	private String trans;
	private Float transAmt;
	private String memo;
	
	public Line(String line) {
		String[] lineArr = line.split(",");
		this.date = lineArr[0];
		this.trans = lineArr[1];
		this.memo = lineArr[4];
		
		printLine();
	}
	
	public String getDate() {
		return this.date;
	}
	
	public String getTrans() {
		return trans;
	}
	
	public float getTransAmount() {
		transAmt = null;
		
		try {
			transAmt = Float.parseFloat(trans);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return transAmt;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public Line getLine() {
		return this;
	}
	
	public String printLine() {
//		System.out.println("Date : " + date);
//		System.out.println("Trans: " + trans);
//		System.out.println("Memo : " + date);
		
		return date+"\n"+trans+"\n"+memo;
	}
}
