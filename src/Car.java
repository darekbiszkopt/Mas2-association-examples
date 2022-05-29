public class Car {

    private Engine engine;
    private final String mark;
    private final String model;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public void addEngine(Engine engine) {
        if (this.engine == null) {
            this.engine = engine;
        }
    }

    @Override
    public String toString() {
        return "Car has: " +
                  engine +
                " | mark: " + mark +
                " | model: " + model;
    }
}
