import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for (int i=0; i<t; i++) {
			List<Integer> l1 = new ArrayList<>();
			List<Integer> l2 = new ArrayList<>();
			int n = Integer.parseInt(br.readLine());
			int a=n/2,b =n/2;
			while(b!=0) {
				if(a==2||a==3)l1.add(a);
				if(b==2||b==3)l2.add(b);
				for(int j=2; j<=(int)Math.sqrt(a); j++) {
					if(a%j==0) break;
					if(j==(int)Math.sqrt(a)) l1.add(a);
					}
				for(int j=2; j<=(int)Math.sqrt(b); j++) {
					if(b%j==0) break;
					if(j==(int)Math.sqrt(b)) l2.add(b);
					}
				a++;
				b--;
			}
			String r = "";
			for(int j=l2.size()-1; j>=0; j--) {
				for(int k=0; k<l1.size(); k++) {
					if(n==l2.get(j)+l1.get(k)) {
						r=l2.get(j)+" "+l1.get(k)+"\n";
						break;
					}
				}
			}
			bw.write(r);
		}
		bw.flush();
	}
}
