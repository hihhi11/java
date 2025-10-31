class PersonalComputer{
    private Computer computer;
    private Monitor monitor;
    PersonalComputer(Computer computer,Monitor monitor){
        this.computer = computer;
        this.monitor = monitor;
    }
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printlnfo(){
        computer.printlnfo();
        monitor.printlnfo();
    }
}
class Monitor{
    private String moniterSize;
    private String color;
    private String power;
    Monitor(String moniterSize,String color,String power){
        this.moniterSize = moniterSize;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.println("Turning on the monitor");
    }
    public void printlnfo(){
        System.out.println("The spec of the monitor");
        System.out.println(" Size: " + moniterSize);
        System.out.println(" Color: "+ color);
        System.out.println(" Power: "+ power);
    }
}
class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    Computer(String cpu, String memory, String hd,
             String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.println("Turning on the computer");
    }
    public void printlnfo(){
        System.out.println("The spec of the computer");
        System.out.println(" CPU: "+ cpu);
        System.out.println(" Memory: "+ memory);
        System.out.println(" HDD: "+ hd);
        System.out.println(" Color: "+ color);
        System.out.println(" Power: "+ power);
    }
}
public class Homework5 {
    public static void main(String[] args) {
        Computer computer = new Computer("Core i7",
                "16GB", "2TB", "White", "500W");
        Monitor monitor = new Monitor("24 inch",
                "Black", "45W");
        PersonalComputer personal = new PersonalComputer(computer, monitor);
        personal.turnOn();
        personal.printlnfo();
    }
}
