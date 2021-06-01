import java.io.*;

public class Main {
	static int n = 0;
	static int[] arr;
	static int count;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		count = 0;
		dfs(0);
		System.out.println(count);
	}

	private static void dfs(int dep) {
		if (dep == n) {
			count++;
			return;
		}
		for (int i = 0; i < n; i++) {
			arr[dep]=i;
			if (queen(dep)) {
				dfs(dep + 1);
			}
		}
	}

	private static boolean queen(int dep) {

		for (int i = 0; i < dep; i++) {
			if (arr[dep] == arr[i]) {
				return false;
			} else if (Math.abs(dep - i) == Math.abs(arr[dep] - arr[i])) {
				return false;
			}
		}
		return true;
	}
}
