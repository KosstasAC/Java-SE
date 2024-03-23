import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class AddArray{
    public static void main(String[] args)
    {

        System.out.println("How many Pukis do you want? ");
        Scanner scr = new Scanner(System.in);
        int numberOfPukies = scr.nextInt();
        scr.close();

        Set<String> pukiSet = PukiCounter(numberOfPukies);
        System.out.println(pukiSet+ "\n");


    }
    public static Set<String> PukiCounter(int numberOfPukies){
        Set<String> puki = new HashSet<String>();

        if(numberOfPukies > 1 || numberOfPukies == 0) {
            puki.add("Here's " +numberOfPukies+ " pukies.");
    
        }else if(numberOfPukies == 1) {
            puki.add("Here's " +numberOfPukies+ " puki.");

        }else {System.out.println("YOU CANOT HAVE NEGATIVE PUKIS!!!");}

        return puki;

    
    }

}