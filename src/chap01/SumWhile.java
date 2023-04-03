package chap01;

import java.util.Scanner;

// 1, 2, ... , n의 합을 구합니다.
public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            i++;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        //Q6
        System.out.println("i의 값은 n 보다 1이 더 큰 " + i + "입니다.");
    }
}
