import java.sql.SQLOutput;

public class xier {
    public  void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int j = i;
                int temp = arr[i];
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] a={1,22,51,2,333,222,48,123};
        xier xier =new xier();
        xier.shellSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
