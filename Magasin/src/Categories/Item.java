package Categories;

public class Item {
    private int id;
    private String name;
    private double value;
    private String description;
    private double price;
    //int data;

    public Item(int id,String name, double value, String description, double price) {
        this.id=id;
        this.name = name;
        this.value = value;
        this.description = description;
        this.price = price;
       // this.data = data;
    }
    public Item(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*  public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }*/

     public void show(){
        System.out.println("\nId: "+id+"\nНазвание: "+name+
                "\nКол-во: "+value+
                "\nОписание: "+description+
                "\nЦена: "+price
                );
    }
}
