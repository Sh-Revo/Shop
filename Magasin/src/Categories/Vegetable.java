package Categories;
import techSpec.Grade;
import techSpec.TechSpec;
import techSpec.TimeLife;



public class Vegetable extends Item implements TechSpec{
    Grade grade;
    TimeLife timeLife;
    public Vegetable(int id, String name, double value, String description, double price) {
        super(id, name, value, description, price);
    }

    public Vegetable(int id, String name, double value, String description, double price, Grade grade, TimeLife timeLife) {
        super(id, name, value, description, price);
        this.grade = grade;
        this.timeLife = timeLife;
    }
    public Vegetable(){

    }

    @Override
    public void show() {
        super.show();
        System.out.println("Сорт: "+grade.getGrade()+"\nГоден до: "+timeLife.getBuff());

    }
}
