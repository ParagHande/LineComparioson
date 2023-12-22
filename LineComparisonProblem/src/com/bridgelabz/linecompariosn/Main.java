package com.bridgelabz.linecompariosn;

public class Main {
	
	public static void main(String[] args) {
		
		LineComparison ln= new LineComparison();
		Line1 line1 = new Line1();
		Line2 line2 = new Line2();
		
		line1.line1();
		line2.line2();
		ln.byEquals();
		ln.byCompareTo();
		
	}

}
;