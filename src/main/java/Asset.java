public abstract class Asset {

    String description;
    String dateAcquired;
    double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
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

    public abstract double getValue();
}
