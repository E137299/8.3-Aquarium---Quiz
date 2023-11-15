import java.util.*;

public class Fish{
    private int minTemp;
    private int maxTemp;
    private ArrayList<Fish> friends;


    public Fish(int min, int max){
        this.minTemp = min;
        this.maxTemp = max;
        this.friends = new ArrayList<Fish>();
    }

    /**
     * @return the minimum temperature this fish can tolerate
     * Postcondition: minTemp() <= maxTemp()
     */
    public int minTemp(){ 
        return minTemp;
     }

    /**
     * @return the maximum temperature this fish can tolerate
     * Postcondition: maxTemp() >= minTemp()
     */
    public int maxTemp(){ 
        return maxTemp;
     }

    /*
     * adds Fish object to friends ArrayList
     */
    public void addFriend(Fish buddy){
        friends.add(buddy);
    }

    /**
     * @return true if this fish is compatible with otherFish, false otherwise
     */
    public boolean isCompatible(Fish otherFish){ 
        return this.friends.contains(otherFish);
    }
}