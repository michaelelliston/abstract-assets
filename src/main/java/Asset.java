public class Asset {
    String description;
    String dateAcquired;
    double originalCost;

    public Asset() {

    }

    public String getDescription() {
        return this.description;
    }

    public String getDateAcquired() {
        return this.dateAcquired;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getValue() {
        return this.originalCost;
    }
}
