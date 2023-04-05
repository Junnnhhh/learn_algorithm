package chap02;

import java.util.Random;
import java.util.Scanner;

// 배열 요소의 최댓값을 나타냅니다.(값을 난수로 생성)
public class MaxOfArrayRand {
    // 배열  a의 최댓값을 구하여 반환합니다.
    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i] > max) max = a[i];
        }

        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90); // 0 ~ 89에 난수를 생성
            System.out.print("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
