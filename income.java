package taxing;

import java.util.Scanner;

public class income {
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			double annSal, adTax = 0;
			
			System.out.println("Enter the Annual Salary: ");
			
			annSal = sc.nextDouble();
			
			System.out.println("Did you pay any advance tax previously: ");
			
			char ch;
			ch = sc.next().charAt(0);
			
			
			if(ch=='y') {
				System.out.println("Enter The amount paid as the advance tax: ");
				adTax = sc.nextDouble();
				
			}
			
			TaxCalc(annSal, adTax);
		}
		
	}
	
	static void TaxCalc(Double sal, double adtax) { 
		adtax /=4;
		
		double taxpayable = sal/100;
		
		if(sal<400000) {
			taxpayable /=4;
		}
		else if(sal>400000 && sal<=1000000) {
			taxpayable = 400000/100;
			taxpayable = taxpayable+((sal-400000)*15)/100;
		}
		else {
			taxpayable = 400000/100;
			taxpayable = taxpayable+(600000*15)/100;
			taxpayable = taxpayable+((sal-1000000)*25)/100;
		}
		
		System.out.println("The taxpayable for this quarter is: "+((taxpayable/4)-adtax));
	}

}
