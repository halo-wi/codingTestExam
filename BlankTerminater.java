package solution;

import java.io.*;
public class BlankTerminater {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i = 1;
		
		while(i>0) {
		
		String s = br.readLine();
		System.out.println(s.replaceAll(" ", ""));
		
		}
	}

}
