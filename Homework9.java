import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Homework9 {
    Map<String,String> idPIn;
    Homework9(Map<String, String> i){this.idPIn = i;}
    public void check(){
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
        Map<String, String> i_o = new HashMap<>();
        try{
            BufferedReader fr = new BufferedReader(new FileReader("db.txt"));
            String id;
            String pass;
            while((id = fr.readLine()) != null){
                id = id.trim();
                pass = fr.readLine();
                pass = pass.trim();
                i_o.put(id, pass);
            }
        }catch(Exception e){e.printStackTrace();}
        Homework9 log = new Homework9(i_o);
        log.check();
    }
}
