package solution;

import java.util.*;

public class Test11_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = 0;
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		
		for (int i = 0; i < n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(list.get(i) != list.get(j)) x++;
			}
		}

		System.out.println(x++);
	}
}
