public class Main {

    public static void main(String[] args)
    {
        Car car = new Car();
        car.setMake("Mazda")  ;
        car.setModel("Carrera")  ;
        car.setColor(" Red");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}