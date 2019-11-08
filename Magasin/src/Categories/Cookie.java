package Categories;

import techSpec.TechSpec;
import techSpec.TimeLife;

public class Cookie extends Item implements TechSpec {
    TimeLife timeLife;
    public Cookie(int id, String name, double value, String description, double price) {
        super(id, name, value, description, price);
    }

    public Cookie(int id, String name, double value, String description, double price, TimeLife timeLife) {
        super(id, name, value, description, price);
        this.timeLife = timeLife;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Срок годности: "+timeLife.getBuff());
    }
}
