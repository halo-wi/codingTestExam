import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		System.out.println(f(s));		
	}
	static int f(int s){
		if(s==0) return 1;
		return s*f(s-1);
		}
}
