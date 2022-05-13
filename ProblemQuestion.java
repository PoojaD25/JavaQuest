import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ProblemQuestion {

    //Take student of 9th and 10th
    //condition same name student will not go on trip

    public static void main(String[] args) {

        ArrayList<String> kids9= new ArrayList<>(Arrays.asList("Rohit", "Raj","Ronit", "Ruchi"));
        ArrayList<String>kids10= new ArrayList<>(Arrays.asList("Rahul","Ritu","Raj", "Pooja"));
        System.out.println("class 9 children: "+ kids9);
        System.out.println("class 10 children: "+kids10);

        kids9.addAll(kids10);

        //1st using linkedhashset
        LinkedHashSet <String> total= new LinkedHashSet<>(kids9);
        System.out.println("total student to go on trip : "+total);

        //2nd using contains
        System.out.println("**************");
        ArrayList<String> kids_9= new ArrayList<>(Arrays.asList("Rohit", "Raj","Ronit", "Ruchi"));
        ArrayList<String>kids_10= new ArrayList<>(Arrays.asList("Rahul","Ritu","Raj", "Pooja"));

        for(String e: kids_9)
        {
            if(!(kids_10.contains(e)))
            {
                kids_10.add(e);
            }

            }
        System.out.println(kids_10);
        }
    }

