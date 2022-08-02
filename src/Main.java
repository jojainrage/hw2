public class Main {
    //hw2
    public static void main(String[] args) {
        Printable[] print = {createObject("1object"),createObject("2object"),createObject("3object")};
        for (Printable printable:print) {
            printable.print();

        }
    }
    public static Printable createObject (String classname){
        switch (classname){
            case "1object":
                Car car = new Car(1999, "BMW","Asus");
                return car ;

            case "2object":
                Bus bus = new Bus(2005,"Rog","Git");
                return bus ;

            case "3object":
                Air air= new Air(2022, "Mercedes","USA");
                return air;
        }
        return null;
    }
}
