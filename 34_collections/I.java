import java.util.ArrayList;

class I {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("mohan");
        list.add("sohan");
        list.add("rohan");
        list.add("gohan");
        list.add("tohan");
        list.add("eohan");

        System.out.println(list);

        // boolean isDeleted = list.remove("gohan");
        boolean isDeleted = list.remove("wohan");
        System.out.println(isDeleted);

        System.out.println(list);
    }    
}

//ArrayList can shrink