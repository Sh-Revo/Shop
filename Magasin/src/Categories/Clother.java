package Categories;

import techSpec.Brend;

public class Clother extends Item {
    Brend brand;
    public Clother(int id, String name, double value, String description, double price) {
        super(id, name, value, description, price);
    }

    public Clother(int id, String name, double value, String description, double price, Brend brand) {
        super(id, name, value, description, price);
        this.brand = brand;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Бренд: "+brand.getName()+
                "\n"+"Год: "+brand.getYear()+
                "\n"+"Персонал: "+brand.getSizeOfWorkers()+
                "\n"+"Страна: "+brand.getSizeOfCountry());
    }
}
