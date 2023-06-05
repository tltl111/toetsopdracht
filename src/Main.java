public class Main {
    public static void main(String[] args) {

        // Creating a generic building for testing
        Building genericBuilding = new Building(1, 1, 1);
        // Creating instances for the subaclasses
        House house1 = new House(1, 2, 2);
        Flat flat1 = new Flat(5, 10, 25);
        Shed shed1 = new Shed(1, 1, 0);

        // Calling some methods from the Building class to test
        System.out.println(genericBuilding.getDoors());
        System.out.println(genericBuilding.getSafetyRating());
        System.out.println();
       
        
        // Using the functions of Building from the house
        // class through inheritance
        System.out.println(house1.getDoors());
        System.out.println(house1.getSafetyRating());
        house1.setResidents(8);
        System.out.println(house1.getSafetyRating());
        house1.setResidents(12);
        System.out.println(house1.getSafetyRating());
        house1.speak();
        System.out.println();
    
        System.out.println(flat1.getDoors());
        System.out.println(flat1.getSafetyRating());
        flat1.setResidents(100);
        System.out.println(flat1.getSafetyRating());
        flat1.speak();
        System.out.println();

        System.out.println(shed1.getSafetyRating());
        System.out.println(shed1.getJunkHoarded());
        System.out.println(shed1.getJunkCapacity());
        shed1.setResidents(1);
        System.out.println(shed1.getSafetyRating());
        shed1.speak();
    }
}
