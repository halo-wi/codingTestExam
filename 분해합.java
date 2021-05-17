import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=1; i<n; i++) {
			int k =i;
			int l =i;
			while(l>0) {
				k+=l%10;
				l/=10;
			}
			if(k==n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
