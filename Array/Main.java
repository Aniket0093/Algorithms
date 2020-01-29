package Array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SingleDimensionArray sda= new SingleDimensionArray(10);
	
	sda.traverseArray();
	
	sda.insert(0, 0);	
	sda.insert(1, 10);
	sda.insert(2, 20);
	sda.insert(3, 30);
	sda.insert(4, 40);
	sda.insert(5, 50);
	sda.insert(6, 60);
	sda.insert(7, 70);
	sda.insert(8, 80);
	sda.insert(1, 100);
	sda.insert(12, 120);
	
	sda.access(4);
	
	sda.search(20);
	}

}
