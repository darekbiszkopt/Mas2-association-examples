import java.util.ArrayList;
import java.util.List;

public class Studio {

    String name;

    public Studio(String name) {
        this.name = name;
    }

    private final List<Actor> actors = new ArrayList<>();
    private final List<Movie> movies = new ArrayList<>();
    public static String toString;

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    public String getStudio() {
        return this.name;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    @Override
    public String toString() {
        toString = "Client: " + name + " has movies: [ ";
        movies.forEach(m -> {
            toString += " | " + m.getTitle() + " | ";
        });
        toString += "] && has actors: [ ";
        actors.forEach(a -> {
            toString += " | " + a.getName() + " | ";
        });
        return toString + " ]";
    }
}
