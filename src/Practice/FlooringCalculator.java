package Practice;

import java.util.Scanner;

/**
 * A program that calculates and displays a quote for new flooring.
 *
 * See the CSCI112_A2.pdf document for details.
 *
 * @author YOUR NAME HERE
 */
public class FlooringCalculator {

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the customer’s name:");
        String name = input.nextLine();

        System.out.println("Enter the customer’s phone number:");
        String phone = input.nextLine();

        System.out.println("Enter the customer’s street address:");
        String street = input.nextLine();

        System.out.println("Enter the customer’s city:");
        String city = input.nextLine();

        System.out.println("Enter the customer’s state:");
        String state = input.nextLine();

        System.out.println("Enter the customer’s zip code:");
        String zip = input.nextLine();

        System.out.println("Enter the number of rooms:");
        int num_rooms = input.nextInt();

        House test_house = new House(num_rooms);
        test_house.setOwnerName(name);
        test_house.setPhoneNumber(phone);
        test_house.setStreetAddress(street);
        test_house.setCity(city);
        test_house.setState(state);
        test_house.setZipCode(zip);

        for (int i = 0; i < num_rooms; i++) {
            System.out.printf("Enter the are(in square feet) of room %d:", (i + 1));
            double area_in = input.nextDouble();
            System.out.println("Select flooring type (1 for Carpet, 2 for Tile, 3 for Hardwood):");
            int floor_choice = input.nextInt();
            FloorType floor_type = null;
            switch (floor_choice) {
                case 1:
                    floor_type = FloorType.CARPET;
                    break;
                case 2:
                    floor_type = FloorType.TILE;
                    break;
                case 3:
                    floor_type = FloorType.HARDWOOD;
                    break;
            }
            test_house.addRoom(area_in,floor_type);
        }
        System.out.printf("Price Quote For: \n %s \n %s \n %s, %s %s \n %s \n",
                test_house.getOwnerName(),
                test_house.getStreetAddress(),
                test_house.getCity(),
                test_house.getState(),
                test_house.getZipCode(),
                test_house.getPhoneNumber()
        );
        System.out.printf("Total Installation Cost: %f \n",test_house.getInstallationCost());
        System.out.printf("Total Flooring Cost: %f \n",test_house.getFlooringCost());
        System.out.printf("Total Estimated Cost: %f \n",test_house.getInstallationCost()+test_house.getFlooringCost());
    }


}
