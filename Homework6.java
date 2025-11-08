class Course{
    protected String code;
    protected String name;
    public Course(String a, String b){
        this.code = a;
        this.name = b;
    }
    public String getCode(){return code;}
    public String getName(){return name;}
}
class OnlineCourse extends Course{
    public OnlineCourse(String a, String b){
        super(a,b);
    }
    @Override
    public String toString(){
        String online = "Code: "+super.getCode()+", Name: "+super.getName()+", Type: Offline";
        return online;
    }
}
class OfflineCourse extends Course{
    public OfflineCourse(String a, String b){
        super(a,b);
    }
    @Override
    public String toString(){
        String offline = "Code: "+super.getCode()+", Name: "+super.getName()+", Type: Online";
        return offline;
    }
}
public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}
