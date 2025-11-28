public class Main {
    public static void main(String[] args) {

        Listik listik = new Listik();
        listik.add(3);
        listik.add(7);
        listik.add(53);
        listik.add(1);
        listik.add(64);
        listik.add(90);

        IteratorListik iterator = (IteratorListik) listik.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}