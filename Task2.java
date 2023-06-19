// Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args){
        Integer acc = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) acc++;               
            }
            if (acc == 0) System.out.print(i + " ");
            acc = 0;
        }        
    }
}
