import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] m = br.readLine().split(" ");
		int a = Integer.parseInt(m[0]);
		int b = Integer.parseInt(m[1]);
		String[][] c = new String[b][a];
		for(int i=0; i<a; i++)	{
			String d = br.readLine().substring(0,b);
			for(int j=0; j<b; j++) {
				c[j][i]=d.substring(j,j+1);
			}
		}
		List<Integer> list = new ArrayList<>();
		int e=0;
		for(int k=0; k<=a-8; k++) {
			for(int l=0; l<=b-8; l++) {
				for(int i=k; i<k+8; i++) {
					for(int j=l; j<l+8; j++) {
						if((i-k)%2==1&&(j-l)%2==1&&c[j][i].equals("B")) e++; 
						if((i-k)%2==0&&(j-l)%2==0&&c[j][i].equals("B")) e++;
						if((i-k)%2==1&&(j-l)%2==0&&c[j][i].equals("W")) e++;
						if((i-k)%2==0&&(j-l)%2==1&&c[j][i].equals("W")) e++;
					}
				}
				list.add(e);
				e=0;
			}
		}
		list.sort(null);
		System.out.println(list.get(0)>64-list.get(list.size()-1)? 64-list.get(list.size()-1):list.get(0));
	}
}
