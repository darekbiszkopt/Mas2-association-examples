public class Engine {

    String engineType;
    String name;
    private Car car;

    private Engine(String engineType, String name, Car car) {
        this.engineType = engineType;
        this.name = name;
        this.car = car;
    }

    public static Engine createEngine(String engineType, String name, Car car) throws Exception {
        if (car == null) {
            throw new Exception("The car does not exist!");
        }
        Engine engine = new Engine(engineType, name, car);

        car.addEngine(engine);

        return engine;
    }

    @Override
    public String toString() {
        return "Engine[" +
                "engineType: " + engineType  +
                " name: " + name
                + "]";
    }
}
