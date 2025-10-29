public class House extends Asset {

    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return this.address;
    }

    public int getCondition() {
        double value = this.getValue();
        if (value >= 180.00) {
            this.condition = 1;
            System.out.println("Condition of " + this.getDescription() + " is excellent!");
            return 1;
        } else if (value >= 130.00 && value <= 179.99) {
            this.condition = 2;
            System.out.println("Condition of " + this.getDescription() + " is good!");
            return 2;
        } else if (value >= 90.00 && value <= 129.99) {
            this.condition = 3;
            System.out.println("Condition of " + this.getDescription() + " is fair.");
            return 3;
        } else {
            this.condition = 4;
            System.out.println("Condition of " + this.getDescription() + " is poor...");
            return 4;
        }
    }

    public int getSquareFoot() {
        return this.squareFoot;
    }

    public int getLotSize() {
        return this.lotSize;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double value = this.originalCost / this.squareFoot;
        value = value + (this.lotSize * 0.25);
        return value;
    }
}
