import java.util.ArrayList;

class H {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("mohan");
        list.add("sohan");
        list.add("rohan");
        list.add("gohan");
        list.add("tohan");
        list.add("eohan");

        System.out.println(list);
        System.out.println(list.size());
        
        list.remove("gohan");
        list.remove("mohan");
        list.remove("eohan");
        
        System.out.println(list);
        System.out.println(list.size());
    }    
}

//ArrayList can shrink