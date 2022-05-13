public class PrimeNo {

    public static boolean isPrime(int num)
    {
        if(num<=1)
        {return false;}

        for (int i=2;i<num;i++)
        {
            if(num%i==0)
            {return false;}
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.print( isPrime(78));


        for (int i=0;i<=10;i++)
        {
            System.out.println( i +":" + isPrime(i));

        }

    }
}
