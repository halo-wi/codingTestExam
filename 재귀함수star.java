import java.io.*;
public class Main {
	static char arr[][];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		arr=new char[n][n];
		star(0,0,n,false);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				bw.write(arr[i][j]);
			}
			bw.write("\n");
		}
		bw.flush();
	}

	private static void star(int x, int y, int n, boolean b) {
		if(b) {
			for(int i=x; i<x+n; i++) {
				for(int j=y; j<y+n; j++) {
					arr[i][j]=' ';
				}
			}
			return;
		}
		if(n==1) {
			arr[x][y]='*';
			return;
		}
		
		int s = n/3;
		int count = 0;
		for(int i=x; i<x+n; i+=s) {
			for(int j=y; j<y+n; j+=s) {
				count++;
				if(count==5) star(i, j, s, true);
				else star(i, j, s, false);
			}
		}
	}
}
