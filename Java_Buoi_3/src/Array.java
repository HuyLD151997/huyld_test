public class Array {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printChan(int[] arr) {
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
    }

    public static void printLe(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }



    public static void main(String[] args) {
        int[] listNumbers = {5,2,6,9,1};
        // Bài 1: in các số trong mảng
        System.out.println("Các số trong mảng là: ");
        printArray(listNumbers);
        System.out.println(" ");
        // Bài 2: in các số chẵn, lẻ trong mảng
        System.out.println("Các số chẵn trong mảng là: ");
        printChan(listNumbers);
        System.out.println(" ");
        // Bài 3: in các số nguyên tó trong mảng
        System.out.println("Các số lẻ trong mảng là: ");
        printLe(listNumbers);
        // function
        // dùng void
        // tham số int[]

    }
}
