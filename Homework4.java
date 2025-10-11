import java.util.Scanner;

public class Homework4 {
    //재귀함수
    int gcd(int m, int n){
        int min,max,r;
        if(n == 0){
            return m;
        }
        else{
            min = (m>n)?n:m;
            max = (m>n)?m:n;
            r = max%min;
            return gcd(min,r);
        }

    }
    //반복함수
//    int gcd_wh(int m, int n){
//        int min,max,r;
//        while(n!=0){
//            n = (m>n)?n:m;
//            m = (m>n)?m:n;
//            r = m%n;
//            m = n;
//            n = r;
//        }
//        return m;
//    }

    public static void main(String[] args){
        int a,b,result,result_wh;
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        // 재귀문 사용시
        Homework4 gcd = new Homework4();
        result = gcd.gcd(a,b);
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", result);
        //반복문 사용시
//        Homework4 gcd_wh = new Homework4();
//        result_wh = gcd_wh.gcd_wh(a,b);
//        System.out.printf("두 수의 최대공약수는 %d입니다.", result_wh);

    }
}
