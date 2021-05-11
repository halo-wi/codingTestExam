import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int q = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String[] arr = s.split(" ");
		int count = 0;
		for (int i=0; i<q; i++) {
			int a = Integer.parseInt(arr[i]);
			for(int j=2; j<a; j++) {
				if(a%j==0) break;
				else if(j==a-1) count++;
			}
			if(a==2) count++;
		}
		bw.write(String.valueOf(count));
		bw.flush();
	}
}
