class Car{
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }


    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> start engine.";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> Brake()";
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "mitsubishi -> start engine.";
    }

    @Override
    public String accelerate() {
        return "mitsubish -> accelerate()";
    }

    @Override
    public String brake() {
        return "mitsubhish -> Brake()";
    }
}
class Toyota extends Car{
    public Toyota(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Toyota -> start engine.";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> Brake()";
    }
}
public class Main {

    public static void main(String args[]){
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Nissan nissan = new Nissan(6, "Nissan Quasquai");
        System.out.println(nissan.startEngine());
        System.out.println(nissan.accelerate());
        System.out.println(nissan.brake());
    }
}
