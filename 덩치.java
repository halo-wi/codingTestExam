import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] kg = new int[n];
		int[] cm = new int[n];
		for(int i=0; i<n; i++) {
			String[] a = br.readLine().split(" ");
			kg[i]=Integer.parseInt(a[0]);
			cm[i]=Integer.parseInt(a[1]);
		}
		for(int i=0; i<n; i++) {
			int r=1;
			for(int j=0; j<n; j++) {
				if(kg[i]<kg[j]&&cm[i]<cm[j]) {
					r++;
				}
			}
			System.out.print(r+" ");
		}
	}
}
