import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int sum = 0;
		for (int i=0; i<n; i++) {
			int a = i+1;
			list.clear();
			count=0;
			while(a!=0) {
				count++;
				list.add(a%10);
				a/=10;
			}
		if(count==1) sum+=1;
		else sum+= result(list,count);
		}
		System.out.println(sum);
	}
	private static int result(List<Integer> list, int count) {
		int y = list.get(0)-list.get(1);
		for(int i=0; i<count-1; i++) {
			int x = list.get(i)-list.get(i+1);
			if (y!=x) return 0;
			y=x;
		}
		return 1;
	}
}
