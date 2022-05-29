import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final String movieName;
    private final List<Studio> studios = new ArrayList<>();
    public static String toString;

    public Movie(String movieName) {
        this.movieName = movieName;
    }
    public String getTitle() {
        return this.movieName;
    }
    public void addStudio(Studio studio1) {
        if (!studios.contains(studio1)){
            studios.add(studio1);
            studio1.addMovie(this);
        }
    }

    @Override
    public String toString() {
        toString = "Movie: " + movieName + " has studios: [ ";
        studios.forEach(s -> {
            toString += " | " + s.getStudio() + " | ";
        });
        return toString + " ]";
    }
}
