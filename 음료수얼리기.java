package solution;

import java.io.*;
public class Solution {

	static int row;
	static int line;
	static int[][] graph = new int[1000][1000];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] matrix = br.readLine().split(" ");
		

		row = Integer.parseInt(matrix[0]);
		line = Integer.parseInt(matrix[1]);


		for (int i = 0; i < row; i++) {

			String m1 = br.readLine();

			for (int j = 0; j < line; j++) {

				graph[i][j] = m1.charAt(j) -'0'; 

			}
		}
		int count=0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < line; j++) {
				if(dfs(i,j)) count++;
			}
		}
		System.out.println(count);

	}

	private static boolean dfs(int i, int j) {
		
		if(i<=-1 || i>=row || j<=-1 || j>=line) return false;	
		
		if(graph[i][j]==0) {
			graph[i][j]=1;
			
			dfs(i,j+1);
			dfs(i+1,j);
			dfs(i,j-1);
			dfs(i-1,j);
			
			return true;
			
		}
		
		
		return false;
	}
}
