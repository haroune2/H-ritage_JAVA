

public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", 100);
        Boat boat = new Boat("Clubman 35", 100);

        System.out.println(car.doStuff()); 
        System.out.println(boat.doStuff()); 
    }
}
