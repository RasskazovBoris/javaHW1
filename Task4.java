import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        String firstNumber = sc.next();
        System.out.print("Введите второе число: ");
        String secondNumber = sc.next();
        System.out.print("Введите ответ: ");
        Integer answer = sc.nextInt();
        Integer flag = 0;
        for (Integer i = 0; i < 10; i++) {
            Integer q = Integer.parseInt(firstNumber.replace("?", Integer.toString(i)));
            Integer w = Integer.parseInt(secondNumber.replace("?", Integer.toString(i)));
            if (q + w == answer){
                System.out.println(q + " + " + w + " = " + answer);  
                flag++;
            }
        }
        if (flag == 0){
            System.out.println("Решений нет!");
        }
        sc.close();
    }
}
