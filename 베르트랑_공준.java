import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			int a = Integer.parseInt(br.readLine());
			if(a==0) break;
			int count = 0;
			for (int i=a+1; i<=a*2; i++) {
				for (int j=2; j<=(int) Math.sqrt(i); j++) {
					if (i % j == 0)
						break;
					else if (j == (int) Math.sqrt(i))
						count++;
				}
				if (i==2 || i==3)
					count++;
			}
			bw.write(String.valueOf(count)+"\n");
		}
		bw.flush();
	}
}
