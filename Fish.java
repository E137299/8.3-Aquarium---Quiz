public class Fish{
    private String type;
    private int minTemp;
    private int maxTemp;
    private ArrayList<Fish> friends;

    public Fish(String t, int mnT, int mxT){
        this.type = t;
        this.minTemp = mnT;
        this.maxTemp = mxT;
        friends = new ArrayList<Fish>();
    }
    /**
     * @return the minimum temperature this fish can tolerate
     * Postcondition: minTemp() <= maxTemp()
     */
    public int minTemp(){
        
    }

    /**
     * @return the maximum temperature this fish can tolerate
     * Postcondition: maxTemp() >= minTemp()
     */
    public int maxTemp(){
        
    }

    /**
     * Preconditions:
     * - The fish object to be added is not null.
     * - The buddy fish's temperature range has been set and is valid.
     * - The fish to be added has a defined temperature range.
     * 
     * Postconditions:
     * - If the fish's temperature range overlaps with the buddy fish's temperature range, the fish is added to the ArrayList.
     * - If the temperature ranges do not overlap, an error message is printed, and the fish is not added to the ArrayList.
     */
    public void addFriend(Fish buddy){
    }

    /**
     * @return true if this fish is compatible with otherFish, false otherwise
     */
    public boolean isCompatible(Fish otherFish){
        
    }

    
}
