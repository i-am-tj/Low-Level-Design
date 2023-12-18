package Collections;

public class Cities {
    private String city;
    private int yearsStayed;

    public Cities(String city, int yearsStayed) {
        this.city = city;
        this.yearsStayed = yearsStayed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearsStayed() {
        return yearsStayed;
    }

    public void setYearsStayed(int yearsStayed) {
        this.yearsStayed = yearsStayed;
    }
}
