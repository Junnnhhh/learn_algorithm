package chap01;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최댓값을 구합니다.

/*
1) max에 a 값을 넣는다.
2) b 값이 max 보다 크면 max에 b 값을 넣는다.
3) c 값이 max 보다 크면 max에 c 값을 넣는다.
 */
public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 : "); int a = sc.nextInt();
        System.out.println("b의 값 : "); int b = sc.nextInt();
        System.out.println("c의 값 : "); int c = sc.nextInt();

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
