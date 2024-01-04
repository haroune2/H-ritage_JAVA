

public class Boat extends Vehicle {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public Boat() {
    }

    @Override
    public String doStuff() {
        // TODO Auto-generated method stub
        return "Je suis "+ this.getBrand() + "et je fais glou glou !";
    }
    
}
