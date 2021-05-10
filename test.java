package aa;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int q = Integer.parseInt(br.readLine());
		for (int i=0; i<q; i++) {
			String s = br.readLine();
			String[] arr = s.split(" ");
			int k = Integer.parseInt(arr[1])-Integer.parseInt(arr[0]);
			int a = (int) Math.floor(Math.sqrt(k-1));
			int b = 1;
			int c = a*a+((a+1)*(a+1)-a*a)/2;
			if(a!=0) {
			if(a%2==0) {
				if(c<k) b=2*a;
				else b=2*a+1;
				}
			if(a%2!=0) {
				if(c<k) b=2*a+1;
				else b=2*a;
				}
			}
			bw.write(b+"\n");
		}
		bw.flush();
	}
}
