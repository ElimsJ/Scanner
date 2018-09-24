

import java.util.Scanner;

public class test {
    public static void main(String [] args)
    {
        System.out.println("wut ur name");
        System.out.println("what your age");
        Scanner name = new Scanner (System.in);
        Scanner age = new Scanner (System.in);
        String nameStr = name.nextLine();
        int ageInt = age.nextInt();
        System.out.println(" "+"your name is"+ " " + nameStr + " "+ "your age is" + " " + ageInt + "");
        name.close();
    }
}
