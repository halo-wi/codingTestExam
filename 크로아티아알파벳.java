import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		n=n.replace("c=", "!");
		n=n.replace("c-", "!");
		n=n.replace("dz=", "!");
		n=n.replace("d-", "!");
		n=n.replace("lj", "!");
		n=n.replace("nj", "!");
		n=n.replace("s=", "!");
		n=n.replace("z=", "!");
		System.out.println(n.length());
		} 
}
