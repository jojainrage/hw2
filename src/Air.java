public class Air extends Transport {
    private String production;
    private String model;

    public Air(int age, String name, String production) {
        super(age, name);
        this.production = production;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Air(int age, String name) {
        super(age, name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Age:2022");
    }
}
