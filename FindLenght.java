import java.util.Scanner;

public class FindLenght {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("give string value");
        String s=sc.nextLine();
        System.out.println("user string: " + s);

        char c[]=s.toCharArray();
        int count=0;
        for(char e:c)
        {

            count++;
        }

        System.out.println("lenght of string: " +count);
    }
}
