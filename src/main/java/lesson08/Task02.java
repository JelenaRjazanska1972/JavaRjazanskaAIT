package lesson08;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum =0;
        System.out.println("Введите сколько угодно чисел чтобы посчитать сумму (0 для остановки)");
        int n = scanner.nextInt();
        //пока н не равно 0
        while (n!=0){
            sum+=n;
            n = scanner.nextInt();
        }
        System.out.println("Ответ: " + sum);
    }
}
