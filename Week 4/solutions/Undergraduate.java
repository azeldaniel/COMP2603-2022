public class Undergraduate extends Student {

    private String minor;
    private String major;
    private int credits;

    public Undergraduate() {

    }

    public String getMinor() {
        return minor;
    }

    public String getMajor() {
        return major;
    }

    public int getCredits() {
        return credits;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        String details = super.toString();
        details += " MAJOR: " + major +
                " MINOR: " + minor +
                " CREDITS: " + credits;
        return details;
    }

    @Override
    public void calculateFees() {
        setFees(credits * 200);
    }

}
