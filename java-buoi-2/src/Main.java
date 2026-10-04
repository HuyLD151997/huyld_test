import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // ôn lại mô hình 3 khối
    // bài 1: tính chu vi và diện tích hcn
    // input: số lượng tham số: chiều dài, chiều rộng
    public static void chuViDienTich(float dai, float rong){
        // fail 1:
        // Th1: dai, rong>0
        if (dai < 0 || rong < 0) {
            System.out.println("Chiều dài, chiều rộng không dc bé hơn 0");
            return;
        }
        float chuVi = 2 * (dai + rong);
        float dienTich = dai * rong;

        // output: in ra chu vi, dien tich
        System.out.println("Chu vi:" + chuVi);
        System.out.println("Dien tich:" + dienTich);
    }

    public static void soLonNhat(int num1, int num2, int num3){
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("Số lớn nhất là: " + max);
    }

    public static void xepLoaiHocLuc (float diemToan, float diemLy, float diemHoa){
        float diemTB = (diemToan + diemLy + diemHoa)/3;
        if (diemTB >= 8){
            System.out.println("Học lực giỏi");
        }else if (diemTB < 8 && diemTB > 5){
            System.out.println("Học lực khá");
        }else {
            System.out.println("Học lực TB");
        }
    }

    public static void tinhTienDien (float sokWh){
        if (sokWh < 0){
            System.out.println("Số kWh không hợp lệ");
            return;
        }

        int tienDien = 0;
        double roundSokWh = Math.ceil(sokWh);
        if (roundSokWh <= 50){
            tienDien = (int) (1800 * roundSokWh);
        } else if (roundSokWh >= 51 && roundSokWh <= 100){
            tienDien =  (1800 * 50) + (int) (2000 * (roundSokWh - 50));
        } else if (roundSokWh >= 101 && roundSokWh <= 200){
            tienDien =  (1800 * 50) + (2000 * 50) + (int) (2500 * (roundSokWh - 100));
        } else {
            tienDien = (1800 * 50) + (2000 * 50) + (2500 * 100) + (int) (3000 * (roundSokWh - 200));
        }
        System.out.println("Tien dien: " + tienDien);
    }

    public static void main(String[] args) {
        // bài 1: tính chu vi, diện tích
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài 1: Tính chu vi, diện tích hcn");
        System.out.println("Nhập chiều dài: ");
        // Phải parse từ string -> number vì sau sẽ nhập cả số và chữ
        float dai = Float.parseFloat(sc.nextLine());

        System.out.println("Nhập chiều rộng: ");
        float rong = Float.parseFloat(sc.nextLine());
        // gọi hàm chuViDientich
        chuViDienTich(dai, rong);

        // Bài 2: Tìm số lớn nhất trong 3 số
        // Input: 3 tham số nguyên
        // Output: Số lớn nhất
        // Process: Thuật toán flag
        // - Chọn 1 số bất kì làm số lớn nhất. Thuong chọn số đầu tiên là số "lớn nhất"
        // - Duyệt từ số thứ 2 trờ đi
        // + nếu số đang xét > số "lớn nhất" -> gán số "lớn nhất" = số đang xét
        // + ngược lại => next
        int num1 = 4;
        int num2 = 9;
        int num3 = 6;
        soLonNhat(num1, num2, num3);

        // Bài 3: Kiểm tra học lực của học sinh dựa vào điểm trung bình
        // Input: Điểm của 3 môn (Toán, Lý, Hoa)
        // Output: Điểm tb 3 môn và đánh giá học lưực dựa vào điểm tb
        // Process:
        // - Nhập 3 số và tính tb
        // - Lấy điểm tb và xếp loại Giỏi >=8, Khá bé hơn 8 và lớn hơn 5, Trung bình là dưới 5
        // Check ko cho nhập trên 10 và dưới 0
        System.out.println("Bài 3: Xếp hạng học lực");
        System.out.println("Nhập môn toán: ");
        float diemToan = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập môn lý: ");
        float diemLy = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập môn hóa: ");
        float diemHoa = Float.parseFloat(sc.nextLine());
        xepLoaiHocLuc(diemToan, diemLy, diemHoa);

        // Bài 4: Tính tiền điện
        // Bậc 1: 1-50kWh -> 1800
        // Bậc 2: 51-100 -> 2000
        // Bậc 3: 101-200 -> 2500
        // Bac 4: 3000
        float sokWh = 50.5f;
        tinhTienDien(sokWh);
    }
}