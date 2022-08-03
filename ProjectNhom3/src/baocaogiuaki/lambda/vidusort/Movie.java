package baocaogiuaki.lambda.vidusort;

public class Movie {
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

    public Boolean getStarred() {
        return starred;
    }

    @Override
    public String toString() {
        return "Movie [rate=" + rate + ", starred=" + starred + ", title=" + title + "]";
    }

    public Double getRate() {
        return rate;
    }

}
