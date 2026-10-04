public class Loop {
    // Bài 1: in các số 1 -> 100
    public static void inSoTu1Toi100(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // Bài 2: in các số chẵn từ 0 -> 100
    public static void inSoChanTu1Toi100(){
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    // Bài 3: tính tổng các số từ 1 -> 300
    public static void sum1To300(){
        int sum = 0;
        for (int i = 1; i <= 300; i++) {
            sum += i;
        }
        System.out.println("Tổng số từ 1 tới 300 là: " + sum);
    }

    // Bài 4: in bảng cửu chương 5
    public static void cuuChuong5(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5*i));
        }
    }

    // Bài 5: Tính giai thừa của n
    // n! = n * (n-1) * (n-2) * ... * 2 * 1
    public static void giaiThua(int n){
        if (n <= 1){
            System.out.println("n không hợp lệ");
            return;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("Giai thừa: " + result);
    }

    // Bài 6: in ra n số fibonaci
    public static void soFibonaci(int n){
        int pre1 = 0;
        int pre2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(pre1 + " ");
            int temp = pre1 + pre2;
            pre1 = pre2;
            pre2 = temp;
        }
    }

    public static void main(String[] args) {
        // Bài 1:
        inSoTu1Toi100();

        // Bài 2:
        inSoChanTu1Toi100();

        // Bài 3:
        sum1To300();

        // Bài 4:
        cuuChuong5();

        // Bài 5:
        int n = 5;
        giaiThua(n);

        // Bài 6:
        soFibonaci(n);
    }
}
