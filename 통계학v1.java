import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] arr=new int[a];
		double c = 0;
		for(int i=0; i<a; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			c+=arr[i];
		}
		Arrays.parallelSort(arr);
		System.out.println((int)Math.round(c/a));
		System.out.println(arr[a/2]);
		int count=0;
		int mode=0;;
		int temp=0;
		int val=0;
		int f = 0;
		for(int i=0; i<a; i++) {
			count=0;
			temp=0;
			for(int j=1; j<a; j++) {
				if(arr[i]==arr[j]) count++;
			}
			if(mode<count) {
				mode=count;
				val=arr[i];
				f=0;
			}
			if(mode==count) {
				mode=count;
				temp=val;
				f++;
				if(f==2) {
					val=arr[i];
				}
			}
		}
		System.out.println(val);
		System.out.println(arr[a-1]-arr[0]);	
	}
}
