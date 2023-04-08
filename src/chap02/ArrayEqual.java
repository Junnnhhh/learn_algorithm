package chap02;

import java.util.Scanner;

// 두 배열이 같은가를 판단
public class ArrayEqual {
    // 두 배열 a, b의 모든 요소가 같은가?
    static boolean equals(int[] a, int[] b) {
        if(a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return false;
        }

        return true;
    }

    // Q4 : 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하시오.
    static void copy(int[] a, int[] b) {
        if(a.length != b.length) return;

        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    // Q5 : 배열 b의 모든 요소를 배열  a에 역순으로 복사하는 메서드 rcopy를 작성하시오.
    static void rcopy(int[] a, int[] b) {
        if(a.length != b.length) return;

        for (int i = b.length-1; i >= 0; i--) {
            a[i] = b[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
        int na = sc.nextInt();

        int[] a = new int[na];

        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int nb = sc.nextInt();

        int[] b = new int[nb];

        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }

        System.out.println("q배열 a와 b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));
    }
}
