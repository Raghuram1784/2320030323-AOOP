package jobtracker;

public class JobApplication implements Comparable<JobApplication>, Cloneable {
    private String name;
    private String pos;
    private double exp;

    public JobApplication(String name, String pos, double exp) {
        this.name = name;
        this.pos = pos;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public String getPos() {
        return pos;
    }

    public double getExp() {
        return exp;
    }

    @Override
    public int compareTo(JobApplication other) {
        return this.name.compareTo(other.getName());
    }

    @Override
    public JobApplication clone() {
        try {
            return (JobApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // Handle exception or return a null value
        }
    }

    @Override
    public String toString() {
        return "Applicant: " + name + ", Position: " + pos + ", Experience: " + exp + " years";
    }
}
