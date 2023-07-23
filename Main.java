public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar.model);
        System.out.println(myCar.price);
        System.out.println(myCar2.make);
        System.out.println(myCar2.year);
        myCar.drive();
        myCar2.breaks();
    }
}