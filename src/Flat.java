public class Flat extends Building {

    public Flat(int floors, int doors, int residents) {
        super(floors, doors, residents);
        updateSafetyRating();
    }
    
    // The safety rating gets assigned with an enum
    // according to your amount of residents.
    public void updateSafetyRating() {
        int residents = this.getResidents();
        if (residents <= 25) {
            setSafety(Safety.SAFE);
        } else if (residents > 25 && residents < 50) {
            setSafety(Safety.UNSAFE);
        } else {
            setSafety(Safety.DANGEROUS);
        }
    }

    // This calls the static method "speak" in Building class
    public void speak() {
        speak("Flat");
    }

    
    @Override
    public void setResidents(int residentsAmount) {
        super.setResidents(residentsAmount);
        updateSafetyRating();
    }
    
}
