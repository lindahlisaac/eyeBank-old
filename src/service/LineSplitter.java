package service;

import java.util.ArrayList;

import transaction.Line;

public class LineSplitter {

	public ArrayList<Line> split(String lines) {
		ArrayList<Line> lineList = new ArrayList<Line>();
		
		String[] lineArray = lines.split(System.getProperty("line.separator"));
		
		for(int x = 0; x < lineArray.length; ++x) {
			
			Line line = new Line(lineArray[x]);
			lineList.add(line);
			System.out.println(line.printLine());
			System.out.println("\n");
			try {
				Thread.sleep(150);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	    return lineList;
	}
}
