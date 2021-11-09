package solution;

import java.util.*;

public class Test11_6 {

	static int x;

	public int solution(int[] food_times, long k) {

		int answer = -1;

		long r = (k / food_times.length);
		int s = (int) (k % food_times.length);

		x = 0;

		int l = f(food_times, r, s);
		
		int t = 0;

		while (t < food_times.length) {

			if (food_times[l % food_times.length] > 0) {
				return l % food_times.length + 1;
			}

			l++;
			t++;
		}

		return answer;
	}

	private int f(int[] food_times, long r, int s) {
		
		if(s>food_times.length) return 0;
		
		
		for (int i = 0; i < food_times.length; i++) {

			food_times[i] = (int) (food_times[i] - r);

			if (food_times[i] <= 0)
				x++;

		}
		
		int l= x+s;
		
		if (x+s > food_times.length) {
			l=f(food_times, l/food_times.length, l%food_times.length);
		}
		
		
		return l;

	}
}
