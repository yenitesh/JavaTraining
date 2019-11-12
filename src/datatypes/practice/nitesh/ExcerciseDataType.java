package datatypes.practice.nitesh;

public class ExcerciseDataType {

	/**
	 * This data type program you need to create the following:
	 * 
	 *  1. Create at least three identifiers
	 *  2. Create few variables using different data types
	 *  3. Add few arithmetic operations
	 *  4. Add few logical operators 	 
	 *  
	 */

	public static void main( String[] args ){  
 
int i = 45;
double j = 762.54;
int k = 3;
double sum = i + j;
if(i>j && i>k) {
	System.out.println("i is the greatest");
}
if(j>i && j>k){
	System.out.println("j is greatest");
}
if(k>i && k>j){
	System.out.println("k is greatest");
}
if(sum == k) {
	System.out.println("Sum of i and j is equal to k");
} else {
	System.out.println("Sum of i and j is not equal to k");
}


	}
}


