package test;

public class Junit {
	public int fibRec(int n) {
		if (n <= 1) {
			return n;
		}
		return fibRec(n - 1) + fibRec(n - 2);
	}
}
