package cis232.examples;

public class SimpleExample {

	public static void main(String[] args) {
		message(10);
	}

	public static void message(int n){
		if(n > 0){
			System.out.println("This is a recursive method.");
			message(n - 1);
		}
	}
}
