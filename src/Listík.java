import java.util.ArrayList;
import java.util.Iterator;

public class Listík implements Iterable<Integer>{
    private ArrayList<Integer> listik;


    public void add(int number){
        listik.add(number);
    }


    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}