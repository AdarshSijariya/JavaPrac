import java.util.ArrayList;
import java.util.Iterator;

class V2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("mohan");
        list.add("rohan");
        list.add("sohan");
        list.add("gohan");
        list.add("tohan");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str.toUpperCase());
        }
    }
}
