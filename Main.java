import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        //Fish
        Fish catfish1 = new Fish("Catfish1",75,85); //0
        Fish catfish2 = new Fish("Catfish2",75,85); //1
        Fish perch1 = new Fish("Perch1",63,77); //2
        Fish perch2 = new Fish("Perch2",63,77); //3
        Fish trout1 = new Fish("Trout1",44,67); //4
        Fish trout2 = new Fish("Trout2",44,67); //5
        Fish minnow1 = new Fish("Minnow1",64,72); //6
        Fish minnow2 = new Fish("Minnow1",64,72); //7
        Fish shad1 = new Fish("Shad1",54,80); //8
        Fish shad2 = new Fish("Shad2",54,80); //9
        Fish anglerfish = new Fish("Anglerfish",34, 39);

        //Fish Friends
        // Catfish are compatible with catfish and perch
        catfish1.addFriend(catfish2);
        catfish1.addFriend(perch1);
        catfish1.addFriend(perch2);

        catfish2.addFriend(catfish1);
        catfish2.addFriend(perch1);
        catfish2.addFriend(perch2);

        //Perch are compatible with catfish, perch and trout
        perch1.addFriend(catfish1);
        perch1.addFriend(catfish2);
        perch1.addFriend(perch2);
        perch1.addFriend(trout1);
        perch1.addFriend(trout2);

        perch2.addFriend(catfish1);
        perch2.addFriend(catfish2);
        perch2.addFriend(perch1);
        perch2.addFriend(trout1);
        perch2.addFriend(trout2);

        //Trout are compatible with trout and perch
        trout1.addFriend(trout2);
        trout1.addFriend(perch1);
        trout1.addFriend(perch2);

        trout2.addFriend(trout1);
        trout2.addFriend(perch1);
        trout2.addFriend(perch2);

        //Minnows are compatible with minnows and shad
        minnow1.addFriend(minnow2);
        minnow1.addFriend(shad1);
        minnow1.addFriend(shad2);

        minnow2.addFriend(minnow1);
        minnow2.addFriend(shad1);
        minnow2.addFriend(shad2);

        //Shad are compatible with shad and minnows
        shad1.addFriend(shad2);
        shad1.addFriend(minnow1);
        shad1.addFriend(minnow2);

        shad2.addFriend(shad1);
        shad2.addFriend(minnow1);
        shad2.addFriend(minnow2);
    }
}
