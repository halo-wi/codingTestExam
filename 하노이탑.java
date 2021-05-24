import java.io.*;
public class Main {
	static int a;
	static int count;	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine());
		int i=1;
		int l=2;
		int j=3;
		hanoi(a, i, l,j);
		System.out.println((int)Math.pow(2, a)-1);
		System.out.println(sb);
	}
	private static void hanoi(int a, int i, int l, int j) {
		if(a==1) {
			sb.append(i+" "+j).append("\n");
			return ;
			}
		hanoi(a-1,i,j,l);
		sb.append(i+" "+j).append("\n");
		hanoi(a-1,l,i,j);
	}
}
