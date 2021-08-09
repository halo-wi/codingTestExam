import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] numbers = { 0,1000, 0, 0, 1000, 0, 0, 1000, 0, 0, 1000,0 };
		System.out.println(solution(numbers));
	}

	public static int solution(int[] money) {
		int answer = 0;
		int s[] = new int[money.length-1];
		int t[] = new int[money.length];
		// 0번쩨 집을 털 때
		s[0] = money[0];
		s[1] = money[0];
		for (int i = 2; i < money.length-1; i++) {
			s[i] = Math.max(s[i - 2] + money[i], s[i - 1]);
			
			System.out.println("s ="+ s[i]);
		}
		// 0번쩨 집을 털지 않을 때
		t[1] = money[1];
		for (int i = 2; i < money.length; i++) {
			t[i] = Math.max(t[i - 2] + money[i], t[i - 1]);
			System.out.println("t ="+ t[i]);
			
		}

		answer = Math.max(s[s.length-1], t[t.length-1]);

		return answer;
	}
}
