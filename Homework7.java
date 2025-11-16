abstract class Printer{
    public String model;
    public int printedCount;
    public int availableCount;
    public abstract boolean print();
}
class InkjetPrinter extends Printer{
    public InkjetPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }
    @Override
    public boolean print(){
        printedCount += 1;
        availableCount -=1;
        if(availableCount == 0){
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족\n", model, printedCount+1);
            return false;
        }
        return true;
    }

}
class LaserPrinter extends Printer{
    public LaserPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }
    @Override
    public boolean print(){
        printedCount += 1;
        availableCount -=1;
        if(availableCount == 0){
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족\n", model, printedCount+1);
            return false;
        }
        return true;
    }

}
public class Homework7 {
    public static void main(String[] args){
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}
