import java.util.ArrayList;
import java.util.List;

public class Actor {
    private final String name;
    private final List<Studio> studios = new ArrayList<>();
    public static String toString;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addStudio(Studio studio1) {
        if (!studios.contains(studio1)){
            studios.add(studio1);
            studio1.addActor(this);
        }
    }

    @Override
    public String toString() {
        toString = "Actor: " + name + " works for studios: [ ";
        studios.forEach(s -> {
            toString += " | " + s.getStudio() + " | ";
        });
        return toString + " ]";
    }
}
