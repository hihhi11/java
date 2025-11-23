import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Homework8 {
    Map<String, String> idPIn ;
    Homework8(Map<String, String> p){this.idPIn= p;}
    void check(){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id:");
            String id = s.next();
            id = id.trim();
            if(idPIn.containsKey(id)){
                System.out.print("password:");
                String pass = s.next();
                if(pass.equals(idPIn.get(id))){
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }else{
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                    System.out.println(" ");
                }
            }else{
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args){
        Map<String, String> idPOut = new HashMap<>();
        String[][] i_p = {{"myId","myPass"},
                         {"myId2","myPass2"},
                         {"myId3","myPass3"}};
        for(String[] iParr: i_p){
            idPOut.put(iParr[0], iParr[1]);
        }
        Homework8 log = new Homework8(idPOut);
        log.check();
    }
}
