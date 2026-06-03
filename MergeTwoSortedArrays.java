
public class MergeTwoSortedArrays {

    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        for (int i = m - 1; i >= 0; i--) {
            int last = arr1[n - 1];
            int j = n - 2;

            while (j >= 0 && arr1[j] > arr2[i]) {
                arr1[j + 1] = arr1[j];
                j--;
            }

            if (j != n - 2 || last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        merge(arr1, arr2);

        for (int x : arr1) System.out.print(x + " ");
        System.out.println();

        for (int x : arr2) System.out.print(x + " ");
    }
}