import java.util.ArrayList;
public class Arraylist {
    public static void main() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(200);
        list.add(19);
        list.add(2);
        list.add(2081);
        list.add(0);
        System.out.println(list);
        list.get(2);
        list.remove(0);
        System.out.println(list.contains(19));
        System.out.println(list);

    }
}
