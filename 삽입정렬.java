public class Blog {
 
    public static void main(String[] args) {
        int[] arr = { 9, 1, 3, 4, 5, 6, 2, 7, 8 };
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", arr[i]);
        }
    }
}
