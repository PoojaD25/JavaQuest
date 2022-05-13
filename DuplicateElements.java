import java.util.*;

public class DuplicateElements {
    // find duplicate elements and no of occurrence
// complexity= O(2n)
    public static void Duplicate( )
    {
        int count =0;
        String [] name={"Java", "PHP","javaScript", "PHP", "GO", "Amazon"};


        for(int i=0;i<name.length; i++)
        {
            for(int j=i+1;j<name.length; j++)
            {
               if(name[i]==name[j])
                 {
                      System.out.println("its duplicate element with brute root technique: "+ name[i]);
                 }
            }

            System.out.print(name[i]+ " ");
        }

    }

    // find duplicate elements

    public static void main(String[] args) {
        DuplicateElements.Duplicate();

        String s = "Indian pataka guddy";
//1way

        for (int i = 0; i < s.length() - 1; i++)
        {
            for (int k = i + 1; k < s.length(); k++)
            {
                if (s.charAt(i) == s.charAt(k))
                {

                    System.out.println("Duplicate element: " + s.charAt(i));
                }
            }
        }
        System.out.println("*******Using Set ********");


        //2way : Set this is effi cient way complexity= O(n)
       String Name[] = {"Java", "PHP", "JavaScript", "PHP", "Java", "Python", "Go"};

        Set<String> element = new HashSet<String>();
        for (String e : Name) {
            if (element.add(e) == false) {
                System.out.println("this is duplicate element :" + e);
            }
        }
        System.out.println(element);
        System.out.println("*****Using Map ******");

        //3rd way Map

        Map <String, Integer> container = new HashMap<String, Integer>();

        for(String a: Name)
        {
            Integer count=container.get(a);
            if(count == null)
            {
                container.put(a,1);
            }

            else
                container.put(a,++count);
        }

        //print duplicate
        Set<Map.Entry<String, Integer> > entryset =container.entrySet();
        for(Map.Entry<String , Integer> entry: entryset)
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }



    }

}
