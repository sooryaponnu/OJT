import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(1,"Apple");
        m1.put(2,"Banana");
        m1.put(3,"Mango");


        System.out.println("Value at Key 1:"+m1.get(1));

        for(Integer key:m1.keySet()){
            System.out.println("Key:"+key+", Value:"+m1.get(key));
        }

        m1.replace(3,"Banana","Watermelon");
        for(Integer key:m1.keySet()){
            System.out.println("key:"+key+", Value:"+m1.get(key));
        }
    }
    
}
