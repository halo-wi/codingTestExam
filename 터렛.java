import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		for(int i=0; i<s; i++ ) {
			String a = br.readLine();
			String[] arr = a.split(" ");
			double x = Math.sqrt(Math.pow((Integer.parseInt(arr[0])-Integer.parseInt(arr[3])),2)+Math.pow((Integer.parseInt(arr[1])-Integer.parseInt(arr[4])),2)); 
			int l = Integer.parseInt(arr[2]);
			int m = Integer.parseInt(arr[5]);
			if(x==0)System.out.println(l==m? -1:0);
			else if(l+m>x&&m+x>l&&x+l>m) System.out.println(2);
			else if(l+m==x||m+x==l||x+l==m) System.out.println(1);
			else System.out.println(0);
		}		
	}
}
