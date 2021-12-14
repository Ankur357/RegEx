import java.util.Comparator;
import java.util.TreeSet;

public class Comp {
    public static void main(String args[]){
       TreeSet<Integer> obj = new TreeSet(new Testt());
       obj.add(10);
       obj.add(23);
       obj.add(4);
        System.out.println(obj);
    }
}

class Testt implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2){
        return - o1.compareTo(o2);
    }
}