

public class Car extends Vehicle {

      

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public Car() {
    }

    @Override
    public String doStuff() {
        // TODO Auto-generated method stub
        return "Je suis "+ this.getBrand() +" et je fais vroum vroum !";
    }
    
}
