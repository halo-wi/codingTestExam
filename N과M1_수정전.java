import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int k = 1;
		for(int i=0; i<m; i++) k*=10;
		for(int i=k/10; i<k; i++) {
			String a = String.valueOf(i);
			if(sol(a,n)) {
				for(int j=0; j<a.length(); j++) {
					System.out.print(a.charAt(j)+" ");
				}
				System.out.println();
			}
		}
	}

	private static boolean sol(String a, int n) {
		for(int j=0; j<a.length(); j++) {
			int b=a.charAt(j)-'0';
			if(b>n||b==0) return false;
			if(a.indexOf(""+b)!=j) return false;
		}
		return true;
	}
}
