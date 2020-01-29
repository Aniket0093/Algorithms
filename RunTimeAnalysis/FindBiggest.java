package RunTimeAnalysis;

public class FindBiggest {

	public int FindBiggestNumber(int[] arr){
		
		int biggestNumber = arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(biggestNumber<arr[i]){
				biggestNumber = arr[i];
			}
		}
		return biggestNumber;
	}
	
}
