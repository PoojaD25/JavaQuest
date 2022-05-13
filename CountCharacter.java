public class CountCharacter {

    public static long countChar(String s)
    {

        long count= s.chars().filter(e-> (char)e == 't' ).count();

        return count;
    }

    public static void main(String[] args)
    {
        countChar("Selenium testing");


        }
    }


