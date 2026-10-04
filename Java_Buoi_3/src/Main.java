//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Bài 1
    // input: 1 số nguyên
    // output: số nguyên có phai là số nguyên tố ko -> true hoặc false
    // process:
    // dk bắt đầu loop: i = 2
    // dk đừng: i <= n-1
    // bước nhảy: i++
    // Th1: n <2 => ko là số nguyên tố
    // Th2: n == 2 => là số nguyên tố
    // Th3: normal
    // + nếu n % i == 0 => ko là số nguyên tố => dừng chương trình
    // + ngược lại => duyệt tiếp
    public static boolean isPrime (int number){
        if (number < 2){
            return false;
        }

        if (number == 2){
            return true;
        }

        // cách 1
//        for (int i = 2; i <= number - 1; i++){
//            if (number % i == 0){
//                return false;
//            }
//        }

        // cách 2:
        int i = 2;
        while (i <= number - 1){
            if (number % i == 0){
                return false;
            }
            i++;
        }
        // duyệt tới number -1 mà vẫn ko chia hết => chắc là số nguyên tố
        return true;
    }

    // Bài 2
    // input: int number
    // output: tổng các chữ số của 1 dãy số - >
    // process
    // 1234
    // tách số 4 từ 1234 => 1234 % 10 = 4
    // xóa 4 khỏi 1234 => 1234 / 10 = 123
    // dk đừng: number > 0
    public static int sumDigits (int number){
        int sum = 0;
        // Th1: number < 0 => abs convert sang số +
        int numberAbs = Math.abs(number);
        while (numberAbs > 0){
            sum += numberAbs % 10;
            numberAbs /= 10;
        }
        return sum;
    }

    public static void printPrime(int[] arr) {
        for (int j : arr) {
            if(isPrime(j)){
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Bài 1: kiểm tra số c phải là số nguyên tố hay ko
        // số 2 là số nguyên tố nhỏ nhất
        // kết quả trả về phải kiểu boolean
        int number = -2;
        boolean check = isPrime(number);
        if (check){ // == true
            System.out.println("Prime Number:" + number);
        }else  {
            System.out.println("Not Prime Number:" + number);
        }

        // Bài 2: tính tổng các chữ số của 1 số
        // cách 1: nếu sài for => convert number => string
        // cách 2: dùng while xử lý trực tiếp với number
        int number2 = -1234;
        int sum = sumDigits(number2);
        System.out.println("Tổng của dãy số " + number2 + " là " + sum);

        int[] listNumbers = {5,2,6,9,1};
        System.out.println("Các prime trong mảng là: ");
        printPrime(listNumbers);
    }
}