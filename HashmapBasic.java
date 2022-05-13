import java.util.*;

public class HashmapBasic {
    public static void main(String[] args) {
        //Add value to map

        Map<String, Integer> friuts=new HashMap<>() ;
        friuts.put("apple",5);
        friuts.put("mango",3);
        friuts.put("pears", 2);
        friuts.put("orange", 3);
        System.out.println("Map content: "+friuts);

        //iterate over key

        Set<String> KeyData=friuts.keySet();
        System.out.println("Set of key ketSet(): "+KeyData);

        Iterator <String >it= friuts.keySet().iterator();
        while(it.hasNext())
        {
           String keyObj= it.next();
           Integer valueObj= friuts.get(keyObj);

            System.out.println("key data : " +keyObj);
            System.out.println("value data get(key): "+valueObj);

        }

        //iterate over Entry

        Iterator<Map.Entry<String , Integer>> i= friuts.entrySet().iterator();
        while (i.hasNext())
        {
            Map.Entry<String,Integer> Entryset= i.next();
           Integer valueData= Entryset.getValue();
            System.out.println("Entry.getvalue(): "+valueData);
           String KEY=Entryset.getKey();

            System.out.println("Entry.getKey(): " +KEY);

            

        }



       /*     @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Integer get(Object key) {
                return null;
            }

            @Override
            public Integer put(String key, Integer value) {
                return null;
            }

            @Override
            public Integer remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends Integer> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<Integer> values() {
                return null;
            }

            @Override
            public Set<Entry<String, Integer>> entrySet() {
                return null;
            }*/
        }
    }

