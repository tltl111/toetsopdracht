public class House extends Building {

    public House(int floors, int doors, int residents) {
        super(floors, doors, residents);
        updateSafetyRating();
    }

    @Override
    public void setResidents(int residentsAmount) {
        super.setResidents(residentsAmount);
        updateSafetyRating();
    }
    
    // The safety rating gets assigned with an enum
    // according to your amount of residents.
    public void updateSafetyRating() {
        int residents = this.getResidents();
        if (residents <= 6) {
            setSafety(Safety.SAFE);
        } else if (residents > 6 && residents < 10) {
            setSafety(Safety.UNSAFE);
        } else {
            setSafety(Safety.DANGEROUS);
        }
    }

    // This calls the static method "speak" in Building class
    public void speak() {
        speak("House");
    }

}
