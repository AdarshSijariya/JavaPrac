import java.util.ArrayList;

class G {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("mohan");
        list.add("sohan");
        list.add("rohan");
        list.add("gohan");
        list.add("tohan");
        list.add("eohan");

        System.out.println(list);

        list.remove("gohan");

        System.out.println(list);
    }    
}

//ArrayList can shrink