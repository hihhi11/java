import java.util.Scanner;
import java.lang.String;

class Student{
    int stuNum;
    String major;
    String name;
    int phone;
    void setStuNum(int s){stuNum = s;}
    int getStuNum(){return stuNum;}
    void setMajor(String m){major = m;}
    String getMajor(){return major;}
    void setName(String n){name = n;}
    String getName(){return name;}
    void setPhone(int p){phone = p;}
    int getPhone(){return phone;}
}
public class Homework2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] p = new Student[3];
        String[] num = {"첫번째", "두번째", "세번째"};
        int n;
        String h;
        for(int i = 0;i<3;i++){
            p[i] = new Student();
            System.out.print("학생의 학번, 이름, " +
                    "전공, 전화번호를 입력하세요: ");
            int stu = s.nextInt();
            String name = s.next();
            String major = s.next();
            int phone = s.nextInt();
            p[i].setStuNum(stu);
            p[i].setName(name);
            p[i].setMajor(major);
            p[i].setPhone(phone);
        }
        System.out.println("\n학생들의 정보는 다음과 같습니다.");
        for(int i = 0; i<3;i++){
            System.out.printf("%s 학생: ",num[i]);
            System.out.printf("%d ",p[i].getStuNum());
            System.out.printf("%s ",p[i].getName());
            System.out.printf("%s ",p[i].getMajor());
            n = p[i].getPhone();
            h = Integer.toString(n);
            System.out.printf("0%s-%s-%s\n",h.substring(0,2),
                    h.substring(2,6),h.substring(6));
        }

    }

}
