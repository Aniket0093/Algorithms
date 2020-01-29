package Array;

public class SingleDimensionArray {

	//Declare
	int arr[] = null;
	
	//Initialize
	public SingleDimensionArray(int sizeOfArray){
		arr = new int[sizeOfArray];
		for(int i = 0; i < arr.length; i++){
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	//Traverse
	public void traverseArray() {
		try{
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}catch(Exception e){
			System.out.println("Array no longer exists");
		}
	}
	
	//Insert
	public void insert(int location, int valueToBeInserted){
		try{
			if(arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("\nSuccessfully inserted " + valueToBeInserted + " at location " + location);
			} else {
				System.out.println("The cell is already occupied by some vlaue");
			}
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index to access the array");
		}
	}
	
	public void access(int cellValue) {
		try  {
			System.out.println(arr[cellValue]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index to access the array");
		}
	}
	
	public void search(int valueToBeSearched) {
		for(int i=0; i<arr.length; i++){
			if(arr[i] == valueToBeSearched) {
				System.out.println("Value found");
				System.out.println("Index of value " + valueToBeSearched + " is " + i);
			}
		}
		System.out.println("Value not found");
	}
}
	

