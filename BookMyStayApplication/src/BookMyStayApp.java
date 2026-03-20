import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Standard", 10);
        roomAvailability.put("Deluxe", 5);
        roomAvailability.put("Suite", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("--- Initial Room Inventory ---");
        inventory.getRoomAvailability().forEach((type, count) ->
                System.out.println(type + ": " + count + " rooms available"));

        System.out.println("\nUpdating Deluxe room inventory...");
        inventory.updateAvailability("Deluxe", 4);

        System.out.println("Current Deluxe Count: " +
                inventory.getRoomAvailability().get("Deluxe"));
    }
}