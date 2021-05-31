public class Blog {

	public static void main(String[] args) {
		int[] arr = { 6, 7, 3, 2, 5, 8, 1, 4 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.printf("%d", arr[i]);
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start >= end)
			return; // 원소가 1개일 때 그대로두기
		int pivot = start; // 첫번째 원소
		int i = start + 1; // 앞 부터 탐색
		int j = end; // 뒤 부터 탐색
		int temp;

		while (i <= j) { // 작은 원소 탐색 값이 큰 원소 탐색 값 보다 앞 일때 까지 반복
			while (i <= end && arr[i] <= arr[pivot])
				i++; // 피벗보다 큰 값을 만날 때 까지
			while (j > start && arr[j] >= arr[pivot])
				j--; // 피벗보다 작은 값을 만날 때 까지

			if (i > j) { // 탐색 결과가 엇갈렸을 때, 작은원소가 앞일 때
				temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;
				// pivot 교체
			} else {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				// i,j 교체
			}
			quickSort(arr, start, j - 1);
			quickSort(arr, j + 1, end);
		}
	}
}
