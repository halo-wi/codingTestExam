package codepratices;

import java.io.*;
import java.util.*;

public class Baek20205 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int a = s.indexOf(" ");
		int n = Integer.parseInt(s.substring(0, a));
		int k = Integer.parseInt(s.substring(a + 1));
		for (int i = 0; i < n; i++) {
			String t = br.readLine();
			List<String> list = new ArrayList<>();
			for (int j = 0; j < 2 * n; j += 2) {
				list.add(t.substring(j, j + 1));
			}
			for (int l = 0; l < k; l++) {
				for (int j = 0; j < list.size(); j++) {
					for (int m = 0; m < k; m++) {
						bw.write(list.get(j) + " ");
					}
				}
				bw.write("\n");
			}
		}
		bw.flush();
	}
}