package LambdaEtc;

public class Movie implements Rolling{
    String title;
    Double rate;
    Boolean starred;

    public Movie() {
    }

    public Movie(String title, Double rate, Boolean starred) {
        this.title = title;
        this.rate = rate;
        this.starred = starred;
    }

    @Override
    public void roll() {
        System.out.println("Film is rolling");
    }
}
