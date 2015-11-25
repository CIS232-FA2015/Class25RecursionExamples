package cis232.examples;

public class EuclidExample {

	public static void main(String[] args) {
		System.out.println(gcd(7,2));
	}
	
	public static int gcd(int x, int y){
		if(x % y == 0){
			return y;
		}else{
			return gcd(y, x % y);
		}
	}

}
