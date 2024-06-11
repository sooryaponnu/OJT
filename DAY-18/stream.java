import java.util.*;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Summer", "Monsoon", "Autmn", "Spring", "Winter");
        List<String> fnames = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
        System.out.println("filtered names are: " + fnames);

        //Sorting
        List<String> snames=names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted names: "+snames);

        //Mapping
        Map<Integer,List<String>>mobj=names.stream().collect(Collectors.groupingBy(String::length));

        System.out.println("Mapping Values:"+mobj);
    }
}