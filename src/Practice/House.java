package Practice;

/**
 * House Object.
 * See the CSCI112_A2.pdf document for details.
 *
 * @author YOUR NAME HERE
 */
public class House {
    private String ownerName;
    private String phoneNumber;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private Room[] rooms;
    private int roomIndex;

    House(int numRooms){
        rooms = new Room[numRooms];
        ownerName = "";
        phoneNumber = "";
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        roomIndex = 0;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void addRoom(double sqft, FloorType fType){
        Room room = new Room(sqft,fType);
        rooms[roomIndex] = room;
        roomIndex = roomIndex + 1;
    }

    public double getInstallationCost(){
        double total_area = 0;
        for(int i = 0;i < roomIndex; i++){
            total_area = total_area + rooms[i].area;
        }
        double installation_cost = total_area * 10;
        return installation_cost;
    }

    public double getFlooringCost(){
        double flooring_cost = 0;
        double flooring_cost_each = 0;
        for(int i = 0;i < roomIndex; i++){
            if (rooms[i].floorType.equals(FloorType.CARPET)){
                flooring_cost_each = 7;
            }
            if (rooms[i].floorType.equals(FloorType.TILE)){
                flooring_cost_each = 5;
            }
            if (rooms[i].floorType.equals(FloorType.HARDWOOD)){
                flooring_cost_each = 6;
            }
            double each_cost = rooms[i].area * flooring_cost_each;
            flooring_cost = flooring_cost + each_cost;
        }
        return flooring_cost;
    }
    /**
     * Room Object.
     * See the CSCI112_A2.pdf document for details.
     */
    private class Room {
        private double area;
        private FloorType floorType;

        Room(double area_in,FloorType floorType_in){
            area = area_in;
            floorType = floorType_in;
        }

        double getArea(){
            return area;
        }

        FloorType getFloorType(){
            return floorType;
        }

    }

}
