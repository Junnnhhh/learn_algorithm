package chap01;

// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다.
public class Max3m {
    // a, b, c의 최댓값을 구하여 반환합니다.
    static int max3(int a, int b, int c) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        return max;
    }

    //Q1 : 네 값의 최댓값을 구하는 max4 메서드를 작성하시오.
    static int max4(int a, int b, int c, int d) {
        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }

    //Q2 : 세 값의 최솟값을 구하는 min3 메서드를 작성하시오.
    static int min3(int a, int b, int c) {
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }

    //Q3 : 네 값의 최솟값을 구하는 min4 메서드를 작성하시오.
    static int min4(int a, int b, int c, int d) {
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
        System.out.println("max3(2,3,2) = " + max3(3,2,2));
        System.out.println("max3(3,1,2) = " + max3(3,1,2));
    }
}
