/*
 * This is main class "Building" from which the other classes
 * inherit.
 */

public class Building {

    private int floors;
    private int doors;
    private int residents;
    private Safety safety;

    public Building(int floors, int doors, int residents) {
        this.floors = floors;
        this.doors = doors;
        this.residents = residents;
        this.safety = Safety.UNDERTERMINED;
    }

    // getters and setters for the various variables.
    public int getFloors() {
        return this.floors;
    }
    public int getDoors() {
        return this.doors;
    }
    public int getResidents() {
        return this.residents;
    }
    public String getSafetyRating() {
        return "This buildings safety is " + this.safety;
    }

    public void setFloors(int floorAmount) {
        this.floors = floorAmount;
    }
    public void setDoors(int doorAmount) {
        this.doors = doorAmount;
    }
    public void setResidents(int residentsAmount) {
        this.residents = residentsAmount;
    }
    public void setSafety(Safety safetyRating) {
        this.safety = safetyRating;
    }

    // This is called from the subclasses with the required String type.
    public static void speak(String type) {
        System.out.println("I'm a " + type + " \\o/");
    }
    
}
