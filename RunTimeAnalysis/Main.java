package RunTimeAnalysis;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {2,1,34,24,8,5,46,80};
		
		FindBiggest fb = new FindBiggest();
		
		System.out.println("Biggest number is: " + fb.FindBiggestNumber(arr));

	}

}
