import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		int min = 2;
		for (int i=n; i<=m; i++) {
			if(i==2) sum=2;
			for(int j=2; j<i; j++) {
				if(i%j==0) break;
				else if(j==i-1) {
					if(sum==0)min=i;
					sum+=i;
					}
			}
		}
		System.out.println(sum==0? -1:sum+"\n"+min);
	}
}
