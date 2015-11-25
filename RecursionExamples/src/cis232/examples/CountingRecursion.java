package cis232.examples;

public class CountingRecursion {

	public static void main(String[] args) {
		countup(10);
		
	}
	
	public static void countdown(int n){
		if(n >= 0){
			System.out.println(n);
			countdown(n - 1);
		}
	}
	
	public static void countup(int n){
		if(n >= 0){
			countup(n - 1);
			System.out.println(n);
		}
	}

}
