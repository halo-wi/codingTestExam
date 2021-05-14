import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		System.out.println(Math.pow(r, 2)*Math.PI);
		System.out.println(Math.pow(r*Math.sqrt(2), 2));
	}
}
