// public: thể hiện phạm vi truy cập của mọi đối tượng
// private: nhưng nơi khác ko thể truy cập
// protected

import java.util.Scanner;

public class Student {
//      liệt kê các thuộc tính (biến) của đối tượng
     String id;
     String name;
     int age;
     public  Student() {
         id = "3";
         name = "W";
         age = 18;
     }

     // hàm khởi tạo đối tượng
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // liệt kê các phương thức (function)
    // hàm nhập giá trị của đối tượng
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã học sinh: ");
        id = sc.nextLine();
        System.out.println("Mời bạn nhập tên: ");
        name = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
    }

    public void show(){
        System.out.println("Mã học sinh: " + id);
        System.out.println("Tên học sinh: " + name);
        System.out.println("Tuổi: " + age);
    }
}
