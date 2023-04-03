package chap01;

import java.util.Scanner;

// 1, 2, ... , n의 합을 구합니다.
public class SumFor {

    // Q9 : 정수 a, b를 포함하고 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하시오.
    static int sumof(int a, int b) {
        int sum = 0;

        for(int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <=n; i++) {
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
