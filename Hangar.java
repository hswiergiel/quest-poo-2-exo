public class Hangar {

    public static void main(String[] args){
        Car car = new Car("Volvo", 42);
        Boat boat = new Boat("Queen Mary", 4500);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
