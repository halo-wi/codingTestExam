import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String[] line = s.split(" ");
		s = br.readLine();
		String[] squre = s.split(" ");
		int a= Integer.parseInt(line[0]);
		int b= Integer.parseInt(line[1]);
		int c= Integer.parseInt(line[2]);
		int x1= Integer.parseInt(squre[0]);
		int x2= Integer.parseInt(squre[1]);
		int y1= Integer.parseInt(squre[2]);
		int y2= Integer.parseInt(squre[3]);
		double y = 0;
		double x = 0;
		if(b!=0) { 
			y = (-c-a*x1)*1.0/b;
			if (y1<y && y2>y) {
				bw.write("Poor");
				bw.flush();
				return;
			} 
			y = (-c-a*x2)/b;
			if (y1<y && y2>y) {
				bw.write("Poor");
				bw.flush();
				return;
			}
		}
		if(a!=0) {
			x = (-c-b*y1)*1.0/a;
			if (x1<x && x2>x) bw.write("Poor");
			else bw.write("Lucky");
			bw.flush();
			return;
		}
		bw.write("Lucky");
		bw.flush();
	}
}
