import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = 0;
		for(int i=666; i<2666800; i++) {
			if(String.valueOf(i).contains("666")) {
				m++;
			}
			if(n==m) {
				n=i;
				break;
			}
		}
		System.out.println(n);
	}
}
