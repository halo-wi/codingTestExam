import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		System.out.println(f(s));		
	}
	static int f(int s){
		if(s==0) return 0;
		if(s<=2) return 1;
		return f(s-2)+f(s-1);
		}
}
