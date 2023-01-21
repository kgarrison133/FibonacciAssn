
public class Main {
//main method. fibRec will be called and n will pass as an argument, but it can be changed to a different number. 
	public static void main(String[] args) {
		int n = 10;
		int nth = fibRec(n);
		//output the proper variables below
		System.out.println("The " +  n +  "th term of the Fibonacci sequence is " + nth + ".");
	}
	//recursive Fibonacci method
	public static int fibRec(int n) {
		if (n <= 1) {
			return n;
		}
		return fibRec(n - 1) + fibRec(n - 2);
	}

}
