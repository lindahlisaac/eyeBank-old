package model;

import java.io.File;
import java.util.ArrayList;

import transaction.Line;

public class Model {

	public String newLine(File file, String line) {
		ArrayList<Line> lineList = new ArrayList<Line>();
		Line lineObj = new Line(line);
		lineList.add(lineObj);
		
		return line;
	}
	
	/*
	 * public ArrayList<Line> getLineList() { return lineList; }
	 */
}
