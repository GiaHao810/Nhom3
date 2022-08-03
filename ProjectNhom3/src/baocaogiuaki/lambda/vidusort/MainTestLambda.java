package baocaogiuaki.lambda.vidusort;

import java.util.Arrays;
import java.util.List;

public class MainTestLambda {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", 8.8, true),
                new Movie("Back to the future", 8.5, false),
                new Movie("Carlito's way", 7.9, false),
                new Movie("Pulp fiction", 8.9, true));

        movies.sort((m1, m2) -> {
            if (m1.getRate() == m2.getRate()) {
                return 0;
            }
            return m1.getRate() > m2.getRate() ? -1 : 1;
        });

        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }
}
