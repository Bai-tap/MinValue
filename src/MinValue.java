import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        int[] array;
        do {
            System.out.print("Nhập vào kích thước của mảng: ");
            size = sc.nextInt();
            if (size > 10)
                System.out.println("Kích thước nhỏ hơn 10 thôi nha!");
        } while (size > 10);
        array = new int[size];


    }
}
