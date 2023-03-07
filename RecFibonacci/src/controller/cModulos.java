package controller;

public class cModulos {
	public int Fibonacci (int f, int [] v, int c, int ac) {
		
		if (c == f) {
			ac = v[c-1];
			return ac;
		} else {
			if (c == 0 || c == 1) {
				v[c] = 1;
			} else {
			v[c] = v[c-1] + v[c-2];
			}
			return Fibonacci(f, v, c+1, ac);
		}
	}
}
