public class insertSort {
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
                if (j == -1) {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
