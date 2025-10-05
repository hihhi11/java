import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요?");
        int howm = sc.nextInt();
        int[] arr = new int[howm];
        System.out.print("수를 입력하세요:");
        for(int i = 0; i<howm ; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i<howm; i++){
            if(min> arr[i]){
                min = arr[i];
            }
        }
        for(int i = 1; i<howm; i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d", min);

    }
}
