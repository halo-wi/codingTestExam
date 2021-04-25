import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			int index = s.indexOf(" ");
			int a = Integer.parseInt(s.substring(0, index));
			int b = Integer.parseInt(s.substring(index + 1));
			bw.write("Case #"+String.valueOf(i + 1)+": ");
			bw.write(String.valueOf(a + b));
			bw.write("\n");
		}
		bw.flush();
		br.close();
	}
}
