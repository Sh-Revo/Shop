package Categories;

import techSpec.*;

public class PC extends Item implements TechSpec{
    private OS os;
    private CPU cpu;
    private RAM ram;
    private GraficsCard graficsCard;
    private GraficsRAM graficsRAM;
    private TimeWorking timeWorking;

    public PC(int id, String name, double value, String description, double price) {
        super(id, name, value, description, price);
    }

    public PC(int id, String name, double value, String description, double price, OS os, CPU cpu, RAM ram, GraficsCard graficsCard, GraficsRAM graficsRAM, TimeWorking timeWorking) {
        super(id, name, value, description, price);
        this.os = os;
        this.cpu = cpu;
        this.ram = ram;
        this.graficsCard = graficsCard;
        this.graficsRAM = graficsRAM;
        this.timeWorking = timeWorking;
    }

    public PC() {
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Техническая спецификация:" + "\n---RAM---" +
                "\nRAM тип: " + ram.getName() + "\nRAM размер: " + ram.getSize()+
                "\n---CPU---"+"\nCPU ядра: "+cpu.getSizeOfCore()+"\nCPU частота: "+cpu.getFrequency()+
                "\n---Видеокарта---"+"\nЯдра: "+graficsCard.getSizeOfCore()+"\n Частота: "+graficsCard.getFrequency()+
                "\nТип памяти: "+graficsRAM.getName()+"\nРазмер: "+graficsRAM.getSize());
    }
}

