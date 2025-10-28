public class Vehicle extends Asset {
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return this.makeModel;
    }

    public int getYear() {
        return this.year;
    }

    public int getOdometer() {
        return this.odometer;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value;
        if (this.year >= 0 && this.year <= 3) {
            value = this.originalCost - (this.originalCost * (this.year * 0.03));
        } else if (this.year >= 4 && this.year <= 6) {
            value = this.originalCost - (this.originalCost * (this.year * 0.06));
        } else if (this.year >= 7 && this.year <= 10) {
            value = this.originalCost - (this.originalCost * (this.year * 0.08));
        } else {
            value = 1000;
        }
        // TODO: return proper value based on other factors
        return value;
    }
}
