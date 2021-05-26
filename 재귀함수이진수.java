import java.io.*;
public class Main {
	static long a;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Long.parseLong(br.readLine());
		System.out.println(bi());
	}
	private static StringBuilder bi() {
		if(a==0) return sb.reverse();
		sb.append(a%2==1? 1:0);
		a/=2;
		return bi();
	}
}
