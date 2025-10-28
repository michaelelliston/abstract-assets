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
        return this.condition;
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
        if (value >= 180.00) {
            return 1;
        } else if (value >= 130.00 && value <= 179.99) {
            return 2;
        } else if (value >= 90.00 && value <= 129.99) {
            return 3;
        } else {
            return 4;
        }
    }
}
