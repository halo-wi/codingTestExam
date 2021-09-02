package solution;

import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println(gcv(a,b));
	}

	private static int gcv(int a, int b) {
		int c = a%b;
		
		System.out.println(b+" "+c);
		
		if(c==0) return b;
		
		
		return gcv(b,c);
	}

}
