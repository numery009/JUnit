package classprogs.util;

public class BasicCalc{

    
 public int add(int i, int j){
	int sum = i + j;
	return sum;
 }
 
 public int subtract(int i, int j){
	int diff = i - j;
	return diff;
 }
 public int multiply(int i, int j){
	int prod = i * j;
	return prod;
 }
 public int division(int i, int j){

	int div = i/j;
	return div;

 }
 
 public String validateFirstName(String firstName){
	 if (firstName.length() > 20){
		 return "FirstName can't be more than 20 characters";
	 }
	 return "";
 }
 public static void main(String[] arg) {
	BasicCalc bc = new BasicCalc();
	int result;
	int a = 4;
	int b = 2;
	
	// addition
	result = bc.add(a,b);
	if (result == 6){
		
	}
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