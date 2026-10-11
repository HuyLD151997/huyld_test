import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student hs1 = new Student("1", "A", 13);
//        hs1.id = "12345";
//        hs1.name = "Harsh";
//        hs1.age = 18;
//        System.out.println(hs1.id);
//        System.out.println(hs1.name);
//        System.out.println(hs1.age);

        //hs1.input();
        //hs1.show();
        System.out.println("======================");
        Student hs2 = new Student("2", "B", 12);
        //hs2.input();
        //hs2.show();

        // Tạo danh sách hs
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(hs1);
        listStudent.add(hs2);
        for (Student student : listStudent) {
            student.show();
            System.out.println("======================");
        }

        System.out.println("Example for auto");
        LoginPage loginPage = new LoginPage();
        loginPage.login("admin", "1234");
        if (loginPage.isLoginSuccess()) {
            System.out.println("Login successful");
        }else  {
            System.out.println("Login failed");
        }

        // ko dùng class cha vì class chỉ để kế thừa
        Car mec =  new Car("1", "Maybach", "Model 2026", 4, "Gas");
        mec.display();
    }
}