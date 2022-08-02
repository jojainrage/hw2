public class Car extends Transport{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(int age, String name, String model) {
        super(age, name);
        this.model = model;
    }

    public Car(int age, String name) {
        super(age, name);

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Age: 1999" );

    }
}
