import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int count=0;
		if (t>=5&&t%5==0) {
			System.out.println(t/5);;
			return;
			}
		if (t<5) {
			if (t%3==0) System.out.println(t/3);
			else System.out.println(-1);
			return;
			}
		while(t%5!=0) {
			t-=3;
			count++;
			if(t<0) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(t/5+count);
	}
}
