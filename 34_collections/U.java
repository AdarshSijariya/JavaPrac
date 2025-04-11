import java.util.ArrayList;
import java.util.Iterator;

class U {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("mohan");
        list.add("rohan");
        list.add("sohan");
        list.add("gohan");
        list.add("tohan");

        Iterator itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
