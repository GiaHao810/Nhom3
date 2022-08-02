package baocaogiuaki.lambda.vidusort;

import java.util.Arrays;
import java.util.List;

public class MainTestLambda {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", 8.8, true),
                new Movie("Back to the future", 8.5, false),
                new Movie("Carlito's way", 7.9, true),
                new Movie("Pulp fiction", 8.9, false));

        movies.sort((m1, m2) -> {
            if (m1.getStarred() == m2.getStarred()) {
                return 0;
            }
            return m1.getStarred() ? -1 : 1;
        });

        movies.forEach(System.out::println);
    }
}
