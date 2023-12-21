package com.bridgelabz.linecompariosn;

public class LineComparison {
	
	public static void main(String[] args) {
		double x1 = 5;  double y1 = 5;
		double x2 = 10; double y2 = 10;
		double x = (x2-x1)*(x2-x1);
		double y = (y2-y1)*(y2-y1);
		double z = x + y;
		double t;  
		double line= z/2;  
		
		do{  
			t=line;  
			line=(t+(z/t))/2;  
		}   
		while((t-line)!= 0);  
		System.out.println("Length of a line = "+ line);
	}
}
