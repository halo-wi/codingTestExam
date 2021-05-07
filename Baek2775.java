package codepratices;

import java.io.*;
import java.util.*;

import java.io.*;

public class Baek2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n+1];
			for(int j=1; j<=n; j++) {
				arr[j]=j;
			}
			if(k!=0) {
				for(int l=0; l<k; l++) {
					for(int j=1; j<=n; j++) {
						arr[j]=arr[j-1]+arr[j];
					}
				}
			}
			bw.write(arr[n]+"\n");
		}
		bw.flush();
	}
}