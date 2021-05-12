import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	String s= br.readLine();
	String[] arr = s.split(" ");
	int a = Integer.parseInt(arr[0]);
	int b = Integer.parseInt(arr[1]);
	for (int i=a; i<=b; i++) {
		for(int j=2; j<=(int)Math.sqrt(i); j++) {
			if(i%j==0) break;
			else if(j==(int)Math.sqrt(i)) bw.write(String.valueOf(i)+" ");
		}
		if(i==2||i==3) bw.write(String.valueOf(i)+" ");
	}
	bw.flush();
	}
}
