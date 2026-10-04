import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Câu lệnh nhập/ xuất data
        // Xuất
        System.out.println("Hello World!");

        // Biến (Variable)
        // <kiểu dữ liệu> <tên biến>;
        // <kiểu dữ liệu> <tên biến> = <giá trị mặc định>;
        // quy tắc đặt tên biến: camel case
//        int num1= 10;
//        System.out.println(num1);
//
//        float num2= 10.5f;
//        System.out.println(num2);
//
//        boolean isActive = true;
//        System.out.println(isActive);
//
//        char ch = 'a';
//        System.out.println(ch);
//
//        String str = "Hello World!";
//        System.out.println(str);

        // 2. Các toán tử
        // 2.1 phép toán: +,-,*,/ (chia lấy nguyên), % (lây dư)
        // VD: cộng số nguyên, cộng số thực, nối chuỗi
//        int number1 =10;
//        int number2 =20;
//        int result = number1 + number2;
//        System.out.println("Tổng 2 số nguyên:" + result);

        // ++ => tăng giá trị lên 1 đơn vị
        // gán giá trị vào number 3 và tang9 giá trị cho number1
//        int number3 = number1++;
//        System.out.println("number3:" + number3);
//        System.out.println("number1:" + number1);

        // cộng trcc rồi mới gắn giá trị vào number4
//        int number4 = ++number2;
//        System.out.println("number4:" + number4);
//        System.out.println("number2:" + number2);

        //number1 += 10; // number1 = number 1 + 10

        // hằng số (constant) -> biến lưu giá trị ko đổi
        final int TIMEOUT = 1000;


        // 2.2 So sánh: >, >= , < , <=, ==, !=, !(phủ định)
        boolean isGreater = 10 > 5;
        boolean isEqual = 10 == 10;
        // đi kèm với condition statement, loop statement

        // 2.3 nối nhiều dk: &&, ||
        boolean isCheck1 = (10 > 5) && (10 < 20);
        // T && T = T
        // T && F = F
        // F && T = F
        // F && F = F
        boolean isCheck2 = (10 > 5) || (10 < 20);
        // T || T = T
        // T || F = T
        // F || T = T
        // F || F = F

        // 3. Nhập data
       // Scanner sc = new Scanner(System.in);
//        System.out.print("Mời bạn nhập số nguyên: ");
//        int number5 = sc.nextInt();
//        System.out.println("Số nguyên bạn nhập là: " + number5);

        // Vừa nhập số nguyên, vừa nhập chữ
        // nhập chữ -> convert số kiểu dữ liệu tương ứng
//        System.out.println("Mời bạn nhập số nguyên: ");
//        int number5 = Integer.parseInt(sc.nextLine());
//        System.out.println("Số nguyên bạn nhập:" +number5);

        // 4. Khai báo mảng
        // mảng số nguyên
        // <kiểu dữ liệu>[] <tên biến> = new <kiểu dữ liệu>[<số lượng phần từ>];
        // <kiểu dữ liệu>[] <tên biến> = {ele1, ele2, ele3, ...};
        // int[] arr = new int[5];
        // int[] arr = {1,2,3,4,5,6};
//        String[] danhSachTen = {"Huy", "Phuong", "Hang"};
//        System.out.println(danhSachTen[0]);
//        System.out.println(danhSachTen[2]);
//        int lengthDS = danhSachTen.length;
//        System.out.println(danhSachTen[lengthDS-1]);

        // 5. Condition statement
        // if{}else

        // Bài 1: kiểm tra điểm thi DH. Nếu dưới điểm chuẩn => Fail


        kiemTraDiemThi();

        // Bài 2: tìm số lớn nhất trong 3 số
        // VD: 4,8,2

        // tạo ha xử lý code liên quan tới kiểm tra


    }

    public static  void kiemTraDiemThi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập điểm thi: ");
        int n = input.nextInt();
        if(n >= 60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}