import java.io.*;
import java.util.*;

public class Main {
	static int n =0;
	static int m =0;
	static int[] arr;
	static boolean[] exp;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		arr=new int[m];
		exp=new boolean[n];
		dfs(0);
		System.out.println(sb);
	}

	private static void dfs(int dep) {
		if(dep==m) {
			for(int i:arr) {
			sb.append(i).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=0; i<n; i++) {
			if(!exp[i]) {
				exp[i]=true;
				arr[dep]=i+1;
				dfs(dep+1);
				exp[i]=false;
			}
		}
	}
}
