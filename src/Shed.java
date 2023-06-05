public class Shed extends Building {

    private int junkHoarded;
    private JunkCapacity junkCapacity;

    public Shed(int floors, int doors, int residents) {
        super(floors, doors, residents);

        updateSafetyRating();
        this.junkHoarded = 0;
        this.junkCapacity = JunkCapacity.EMPTY;
    }

    // Getter and setters for the Shed class.
    public int getJunkHoarded() {
        return this.junkHoarded;
    }
    public String getJunkCapacity() {
        return "This shed is " + this.junkCapacity;
    }

    // while setting the junkhoarded amount the capacity is
    // set with an enum
    public void setJunkHoarded(int junkHoarded) {
        this.junkHoarded = junkHoarded;
        if (this.junkHoarded > 0 && this.junkHoarded <= 5) {
            this.junkCapacity = JunkCapacity.FULL;
        } else if (this.junkHoarded > 5) {
            this.junkCapacity = JunkCapacity.HOARDING;
        } else {
            this.junkCapacity = JunkCapacity.EMPTY;
        }
    }

    @Override
    public void setResidents(int residentsAmount) {
        super.setResidents(residentsAmount);
        updateSafetyRating();
    }
    
    // The safety rating gets assigned with a enum
    // according to your amount of residents.
    public void updateSafetyRating() {
        int residents = this.getResidents();
        if (residents > 0) {
            setSafety(Safety.DANGEROUS);
        } else {
            setSafety(Safety.SAFE);
        }
    }

    // This calls the static method "speak" in Building class
    public void speak() {
        speak("Shed");
    }
    
}
