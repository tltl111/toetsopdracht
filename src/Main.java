public class Main {
    public static void main(String[] args) {

        Building genericBuilding = new Building(1, 1, 1);
        System.out.println(genericBuilding.getDoors());
        System.out.println(genericBuilding.getSafetyRating());
        System.out.println();

        House house1 = new House(1, 2, 2);
        System.out.println(house1.getDoors());
        System.out.println(house1.getSafetyRating());
        house1.setResidents(8);
        System.out.println(house1.getSafetyRating());
        house1.setResidents(12);
        System.out.println(house1.getSafetyRating());
        house1.speak();
        System.out.println();
    
        Flat flat1 = new Flat(5, 10, 25);
        System.out.println(flat1.getDoors());
        System.out.println(flat1.getSafetyRating());
        flat1.setResidents(100);
        System.out.println(flat1.getSafetyRating());
        flat1.speak();
        System.out.println();

        Shed shed1 = new Shed(1, 1, 0);
        System.out.println(shed1.getDoors());
        System.out.println(shed1.getSafetyRating());
        System.out.println(shed1.getJunkHoarded());
        System.out.println(shed1.getJunkCapacity());
        shed1.setResidents(1);
        System.out.println(shed1.getSafetyRating());
        shed1.speak();
    }
}
