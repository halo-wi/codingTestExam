import java.io.*;
import java.util.Arrays;

public class Main {

	static int[] s;
	static int n;
	static int m;
	static StringBuilder sb = new StringBuilder();
	static boolean[] b;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");

		m = Integer.parseInt(arr[0]);
		n = Integer.parseInt(arr[1]);
		
		b = new boolean[m];

		s = new int[m];

		for (int i = 0; i < m; i++) {
			s[i] = Integer.parseInt(arr2[i]);
		}

		Arrays.sort(s);

		bt(0, "");
		
		System.out.print(sb.substring(0, sb.length()-1).toString());

	}

	private static void bt(int i, String string) throws IOException {

		if (i >= n) {
			
			sb.append(string.substring(0,string.length()-1)+"\n");
			
			return;
			
		} else {

			for (int k=0; k<m; k++) {
				if (!b[k]) {
					b[k] = true;
					bt(i + 1, string + s[k] + " ");
					b[k] = false;
				}
			}
		}
	}
}
