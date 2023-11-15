import java.util.*;

public class Tank{
    private ArrayList<Fish> fishies;
    private int temp;
    

    public Tank(int temp){
        this.temp = temp;
        this.fishies = new ArrayList<Fish>();
    }

    /**
     * Returns a list of all fish in this tank. If there are
     * no fish in this tank, returns an empty list.
     * @return a list of all fish in the tank or an empty list
     */
    public ArrayList<Fish> getFish(){ 
        return this.fishies;
     }

    /**
     * @return the temperature of this tank
     */
    public int temp(){ 
        return this.temp;
     }

    /**
     * Adds the specified fish to this tank
     * @param fishy the fish to add
     */
    public void addFish(Fish fishy){ 
        this.fishies.add(fishy);
     }
}