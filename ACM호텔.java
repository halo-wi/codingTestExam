import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			String[] a = s.split(" ");
			int b = Integer.parseInt(a[0]);
			int c = Integer.parseInt(a[1]);
			int d = Integer.parseInt(a[2]);
			String e = String.valueOf(d%b==0? b:d%b);
			if ((d-1)/b+1<10) e+= "0"+((d-1)/b+1);
			else e+= (d-1)/b+1;
			bw.write(e+"\n");
		}
		bw.flush();
	}	
}
