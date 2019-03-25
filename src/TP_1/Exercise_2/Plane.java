package TP_1.Exercise_2;

public class Plane implements Comparable<Plane> {
    private int id;
    private String company;

    public Plane(int id, String company) {
        this.id = id;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public int compareTo(Plane o) {
        if(!this.company.equals(o.company)) {
            return this.company.compareTo(o.company);
        }
        return this.id - o.id;
    }
}
