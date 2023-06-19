// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Введите число: ");
        Integer number = sc.nextInt();
        Integer acc = 0;
        for (int i = 0; i <= number; i++) {
            acc = acc + i;
        }
        System.out.printf("Сумма чисел от 1 до %d равна %d \n", number, acc );
        acc = 1;
        if (number == 0) {
            acc = 0;
        }
        else {
        for (int i = 1; i <= number; i++) {
            acc = acc * i;
            }
        }
        System.out.printf("Произведение чисел от 1 до %d равна %d", number, acc);
        sc.close();
    }  
}