# 8.3-Aquarium---Quiz

## **Problem description**
### **Fish**
The Fish class stores information about the minimum and maximum temperatures that a fish can tolerate as well as other fish with which it is compatible. The declaration of the Fish class is shown below.

```java
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
```
### **Tank**

The Tank class stores the temperature of the tank and the list of fish in the tank. The declaration of the Tank class is shown below.

```java
public class Tank{
    private ArrayList<Fish> fishies;
    private int temp;

    public Tank(int t){
        this.temp = t;
        fishies = new ArrayList<Fish>();
    }
    
    /**
     * Returns a list of all fish in this tank. If there are
     * no fish in this tank, returns an empty list.
     * @return a list of all fish in the tank or an empty list
     */
    public ArrayList<Fish> getFish(){
        
    }

    /**
     * @return the temperature of this tank
     */
    public int temp(){
        
    }

    /**
     * Adds the specified fish to this tank
     * @param fishy the fish to add
     */
    public void addFish(Fish fishy){
        
    }

    // There may be variables, constructors, and methods that are not shown.
}
```
### **Aquarium**
An aquarium stores information about the fish in its tanks, about the tanks themselves, and about the positions of the tanks relative to each other.

The Aquarium class stores all tanks in the aquarium. The declaration of the Aquarium class is shown below. You will write several methods of the Aquarium class.

```java
public class Aquarium
{
    // The list of all tanks in the aquarium; guaranteed never to be null
    private ArrayList<Tank> tanks;

    /**
     * Returns a tank in this aquarium with a temperature fishy can tolerate and
     * that does not contain a fish that is not compatible with fishy. Returns
     * null if there is no such tank in this aquarium.
     * Postcondition: The state of this aquarium is unchanged.
     * @param fishy the fish to be checked
     * @return a suitable tank for fishy or null if no such tank exists
     */
    private Tank findTank(Fish fishy)
    {
        /* to be implemented in part (a) */
    }

    /**
     * Adds each fish in fishes to a suitable tank in this aquarium if such a
     * tank exists. Each fish should be added to at most 1 tank.
     * @param fishes the list of fish to add
     * @return a list of the fish in fishes that could not be added
     */
    public ArrayList<Fish> addFish(ArrayList<Fish> fishes)
    {
        /* to be implemented in part (b) */
    }

    /**
     * Adds fishTank to this aquarium if a suitable position can be found. The
     * temperature of fishTank can be no more than 5 degrees different (lower or
     * higher) than each of any adjacent tanks.
     * Postcondition: the order of the other tanks in the aquarium relative to each other is not changed
     * @param fishTank the tank to add
     * @return true if fishTank was added, false otherwise
     */
    public boolean addTank(Tank fishTank)
    {
        /* to be implemented in part (c) */
    }

    // There may be instance variables, constructors, and methods that are not shown.
}
```

## **Part (a) findTank method**
The findTank method finds and returns a tank in the aquarium with a temperature that fishy can tolerate and that does not contain a fish that is not compatible with fishy. If there is more than one such tank, any of them may be returned. If there is no such tank, the method returns null.

For Fish f1 and Fish f2: f1.isCompatible(f2) == f2.isCompatible(f1)

Complete method findTank.

```java
/**
 * Returns a tank in this aquarium with a temperature fishy can tolerate and
 * that does not contain a fish that is not compatible with fishy. Returns
 * null if there is no such tank in this aquarium.
 * Postcondition: The state of this aquarium is unchanged.
 * @param fishy the fish to be checked
 * @return a suitable tank for fishy or null if no such tank exists
 */
private Tank findTank(Fish fishy)
```

## **Part (b) addFish method**
The addFish method adds each fish in fishes to a suitable tank in the aquarium if such a tank exists. The method returns a list of fish from fishes for which no suitable tank exists. Each fish should be added to at most one tank.

Assume that findTank works as specified regardless of what you wrote in part (a). You must use findTank appropriately to receive full credit.

Complete method addFish.

```java
/**
 * Adds each fish in fishes to a suitable tank in this aquarium if such a
 * tank exists. Each fish should be added to at most 1 tank.
 * @param fishes the list of fish to add
 * @return a list of the fish in fishes that could not be added
 */
public ArrayList<Fish> addFish(ArrayList<Fish> fishes)
```

## **Part (c) addTank method** 
The addTank method adds fishTank to the aquarium if a suitable position can be found. The temperature of fishTank can be no more than 5 degrees different (lower or higher) than each of any adjacent tanks. The aquarium may contain zero or more tanks. The method returns true if fishTank was successfully added, false otherwise. The positions of the tanks already in the aquarium relative to each other should not be changed.

Complete method addTank.
```java
/**
 * Adds fishTank to this aquarium if a suitable position can be found. The
 * temperature of fishTank can be no more than 5 degrees different (lower or
 * higher) than each of any adjacent tanks.
 * Postcondition: the order of the other tanks in the aquarium relative to each other is not changed
 * @param fishTank the tank to add
 * @return true if fishTank was added, false otherwise
 */
public boolean addTank(Tank fishTank)
```
