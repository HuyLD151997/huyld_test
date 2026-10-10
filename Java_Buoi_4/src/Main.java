import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    // Bài 1: Xóa các ký tự nguyên âm trong chuỗi
    public static String removeVowels(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            char lowerCase = Character.toLowerCase(c);
            if(lowerCase != 'a' && lowerCase != 'e' && lowerCase != 'i' && lowerCase != 'o' && lowerCase != 'u') {
                sb.append(lowerCase);
            }
        }
        return sb.toString();
    }

    // Bài 2:
    public static int countWords(String str) {
        // B1: string => mảng các từ trong string
        // VD: "Xin chào các bạn" => ["Xin", "chào", "các", "bạn"]
        // B2: dùng length có sẵn của mảng để đếm số lượng item trong mảng
        String[] words = str.split(" ");
        return words.length;
        // return str.split(" ").length;
    }

    // Bài 3 đản ngược chuỗi
    public static String reverseString(String str) {
        // cách 1: dùng for duyệt từ ký tự cuối đi lên đầu chuỗi
//        if (str == null) return null;
//        StringBuilder sb = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//          // System.out.print(str.charAt(i));
//            char c =  str.charAt(i);
//            sb.append(c);
//        }
//        return sb.toString();
        // cách 2: dùng hàm reverse có sẵn
        return new StringBuilder(str).reverse().toString();
    }

    // Collection trong java
    public static void learningCollection(){
        // mảng trong Collection

        // cách 1:
        Integer[] arr = {14, 2, 33, 4, 15};
        List<Integer> listInt = new ArrayList<>(Arrays.asList(arr));

        // cách 2:
        List<String> listStr = new ArrayList<>();

        // 1. sắp xếp mảng số nguyên
        // tăng dần (default)
        Collections.sort(listInt);
        System.out.println(listInt);

        // giảm dần
        Collections.sort(listInt, Collections.reverseOrder());
        System.out.println(listInt);

        // đảo mảng
        Collections.reverse(listInt);
        System.out.println(listInt);

        // tìm max, min
        System.out.println("Max: " + Collections.max(listInt));
        System.out.println("Min: " + Collections.min(listInt));

        // đếm số lần xuất hiện của item bất kỳ
        System.out.println("Count 4:" + Collections.frequency(listInt, 4));

        // thêm, xóa, sửa item trong list
        // thêm item vào cuối của listStr
        listStr.add("hello");
        listStr.add("world");
        listStr.add(1,"Huy");
        System.out.println(listStr);

        // đọc item
        System.out.println(listStr.get(1));

        // update
        listStr.set(0, "Lê");
        System.out.println(listStr);

        // xóa item
        // - xóa theo index
        listStr.remove(0);
        System.out.println(listStr);
        // - xóa theo item
        listStr.remove("world");
        System.out.println(listStr);
    }

    // Tính tổng các số trong mảng
    public static void sum(){
        List<Integer> list = new ArrayList<>(Arrays.asList(8, 2, 9, 4, 5));
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        System.out.println("Sum: " + sum);
        // Tính tb
        double avg = (double)sum / list.size();
        System.out.println("Avg: " + avg);
    }

    public static void removeSoAm(){
        List<Integer> list = new ArrayList<>(Arrays.asList(8, -2, 9, -4, 5));
        // cách 1: dùng for
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) < 0){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);

        // cách 2: dùng removeIf
        list.removeIf(num -> num < 0);
        System.out.println(list);
    }


    public static void main(String[] args) {
        // Bài 1
        String str = "CybErsoft";
        System.out.println(removeVowels(str));

        // Bài 2:
        String str2 = "Xin chào các bạn";
        System.out.println(countWords(str2));
        String str3 = "Hello world";
        System.out.println(countWords(str3));

        // Bài 3:
        String str4 = "Hello";
        System.out.println(reverseString(str4));

        // Bài 4:
        learningCollection();

        removeSoAm();
    }
}