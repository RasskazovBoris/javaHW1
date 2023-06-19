import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        Integer firstNumber = sc.nextInt();
        System.out.print("Введите знак: ");
        String symbol = sc.next();
        System.out.print("Введите второе число: ");
        Integer secondNumber = sc.nextInt();
        if (symbol.equals("*") == true){
            Integer answer = (firstNumber * secondNumber);
            System.out.print(answer);
        }
        else if (symbol.equals("/") == true){
            Integer answer = (firstNumber / secondNumber);
            System.out.print(answer);
        }
        else if (symbol.equals("-") == true){
            Integer answer = (firstNumber - secondNumber);
            System.out.print(answer);
        }
        else if (symbol.equals("+") == true){
            Integer answer = (firstNumber + secondNumber);
            System.out.print(answer);
        }
        sc.close();
    }
}
