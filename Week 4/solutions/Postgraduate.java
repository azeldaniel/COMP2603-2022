public class Postgraduate extends Student {
    private String supervisor;
    private String thesisTitle;
    private String status;

    public Postgraduate(String name, String supervisor, String thesisTitle) {
        super(name);
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
        status = "Full Time";
        setStatus("Full Time");
    }

    public void setStatus(String status) {
        if (status.equals("Part Time"))
            this.status = status;
        else
            this.status = "Full Time";
    }

    public String toString() {
        String details = super.toString();
        details += " SUPERVISOR: " + supervisor +
                " THESIS: " + thesisTitle +
                " STATUS: " + status;
        return details;
    }

    @Override
    public void calculateFees() {
        if (this.status.equals("Full Time"))
            setFees(2650);
        else
            setFees(1325);
    }
}
