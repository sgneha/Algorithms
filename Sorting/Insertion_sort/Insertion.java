package Sorting.Insertion_sort;

class Insertion {
    void sort(int arr[], int n) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }
            arr[j + 1] = value;

        }

    }

    static void printArray(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 6, 4, 88, 1 };
        Insertion obj = new Insertion();
        int n = arr.length;
        obj.sort(arr, n);
        printArray(arr, n);

    }
}