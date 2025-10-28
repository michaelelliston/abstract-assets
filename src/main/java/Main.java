import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<Asset>();

        Vehicle vehicleOne = new Vehicle("My Car", "September 26, 2019", 10000, "Toyota", 5, 100762);
        Vehicle vehicleTwo = new Vehicle("Dave's Truck", "January 2, 20011", 8000, "Ford", 14, 142973);
        House houseOne = new House("My House", "March 12, 2014", 213000, "73 Real Str", 213, 245);
        House houseTwo = new House("Your House", "December 1, 2016", 184221, "89 Fake Rd", 197, 232);

        System.out.printf("The value of %s is: $%.2f\n", vehicleOne.getDescription(), vehicleOne.getValue());

        assets.add(vehicleOne);
        assets.add(vehicleTwo);
        assets.add(houseOne);
        assets.add(houseTwo);

        for (Asset asset : assets) {
            System.out.printf("This asset is %s, acquired %s, and is worth $%.2f\n", asset.getDescription(), asset.getDateAcquired(), asset.getValue());
        }
    }
}
