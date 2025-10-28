import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<Asset>();

        Vehicle vehicleOne = new Vehicle("my car", "September 26, 2019", 10000, "Toyota", 5, 100762);
        Vehicle vehicleTwo = new Vehicle("Dave's truck", "January 2, 2011", 8000, "Ford", 14, 142973);
        House houseOne = new House("my house", "March 12, 2014", 213000, "73 Real Str", 213, 245);
        House houseTwo = new House("your house", "December 1, 2016", 184221, "89 Fake Rd", 197, 232);

        System.out.printf("The value of %s is: $%.2f\n", vehicleOne.getDescription(), vehicleOne.getValue());

        assets.add(vehicleOne);
        assets.add(vehicleTwo);
        assets.add(houseOne);
        assets.add(houseTwo);

        for (Asset asset : assets) {
            if (asset instanceof House) {
                House castedAsset = (House) asset;
                System.out.printf("This asset is %s, acquired %s, and is worth $%.2f. It is located at %s.\n", castedAsset.getDescription(), castedAsset.getDateAcquired(), castedAsset.getValue(), castedAsset.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle castedAsset = (Vehicle) asset;
                System.out.printf("This asset is %s, acquired %s, and is worth $%.2f. It is a %s, and is %d years old.\n", castedAsset.getDescription(), castedAsset.getDateAcquired(), castedAsset.getValue(), castedAsset.getMakeModel(), castedAsset.getYear());
            } else {
                System.out.println("Whatever object that is, it ain't a House or a Vehicle.");
            }
        }
    }
}
