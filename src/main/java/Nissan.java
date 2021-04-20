class Nissan extends Car{
    public Nissan(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Nissan -> start engine.";
    }

    @Override
    public String accelerate() {
        return "Nissan -> accelerate()";
    }

    @Override
    public String brake() {
        return "Nissan -> Brake()";
    }
}
