import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		int k =Integer.parseInt(a[0]);
		int v =Integer.parseInt(a[1]);
		int[] c = new int[k];
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<k; i++) {
			c[i]=Integer.parseInt(b[i]);
		}
		for(int i=0; i<k; i++) {
			for(int j=0; j<k; j++) {
				if(i==j) break;
				for(int l=0; l<k; l++) {
					if(l==i||l==j) break;
					if(c[i]+c[j]+c[l]<=v) list.add(c[i]+c[j]+c[l]);
				}
			}
		}
		list.sort(null);
		System.out.println(list.get(list.size()-1));
	}
}
