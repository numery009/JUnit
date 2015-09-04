package classprogs.client;

import classprogs.util.BasicCalc;

public class BasicCalcClient{
 public static void main(String[] arg) {
	
	int a = Integer.parseInt(arg[0]);
	int b = Integer.parseInt(arg[1]);
	BasicCalc bc = new BasicCalc();
	int result;
	//int a = 4;
	//int b = 2;
	
	// addition
	result = bc.add(a,b);
	System.out.println("Addition: " + result);

	//subtract
	result = bc.subtract(a,b);
	System.out.println("Difference: " + result);

	//product
	/*
		line1
		lin2
	*/

	/**
	*/
	result = bc.multiply(a,b);
	System.out.println("Poduct: " + result);

	result = bc.division(a, b);
	System.out.println("Division: " + result);
 }
}