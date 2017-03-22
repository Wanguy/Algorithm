public class fastSort {
    public static int[] fastSort(int[] arr, int left, int right) {
        if (left < right) {
            int s = arr[left];
            int i = left;
            int j = right + 1;
            while (true) {
                //向右找大于s的元素的索引
                while (i + 1 < arr.length && arr[++i] < s) ;
                //向左找小于s的元素的索引
                while (j - 1 > -1 && arr[--j] > s) ;
                //如果i >= j 推出循环
                if (i >= j) {
                    break;
                } else {
                    //教化i和j位置的元素
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            arr[left] = arr[j];
            arr[j] = s;
            //对左面进行递归
            fastSort( arr, left, j - 1 );
            //对右面进行递归
            fastSort( arr, j + 1, right );
        }
        return arr;
    }
}
