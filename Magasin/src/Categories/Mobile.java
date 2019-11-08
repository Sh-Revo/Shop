package Categories;
import techSpec.*;
//import java.util.Scanner;
public class Mobile extends Item implements TechSpec{
    private OS os;
    private RAM ram;
    private CPU cpu;
    private ScreenDiagonal screenDiagonal;
    private TimeWorkingBattery timeWorkingBattery;
    private TimeWorking timeWorking;

    public Mobile(int id, String name, double value, String description, double price) {

        super(id, name, value, description, price);
    }

    public Mobile(int id, String name, double value, String description, double price, OS os, RAM ram, CPU cpu, ScreenDiagonal screenDiagonal, TimeWorkingBattery timeWorkingBattery, TimeWorking timeWorking) {
        super(id, name, value, description, price);
        this.os = os;
        this.ram = ram;
        this.cpu = cpu;
        this.screenDiagonal = screenDiagonal;
        this.timeWorkingBattery = timeWorkingBattery;
        this.timeWorking = timeWorking;
    }

    public Mobile() {
    }

    @Override
    public void show() {
//        Scanner in=new Scanner(System.in);

        super.show();
/*        os=in.nextLine();*/
        System.out.println("Операционная система: "+os.getOs()+"\nRAM размер и тип: "+ram.getSize()+"("+ram.getName()+")"+
                "\nCPU кол-во ядер и частота: "+cpu.getSizeOfCore()+"("+cpu.getFrequency()+")"+"\nРазмер экрана: "+screenDiagonal.getDiagonal()+
                "\nБаттарея: "+timeWorkingBattery.getTimeWork()+ "\nВремя работы: "+timeWorking.getHour());


    }
}
