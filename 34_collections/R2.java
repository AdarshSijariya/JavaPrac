import java.util.ArrayList;

class R2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        System.out.println(list);

        // list.add(5, 99); //insert
        list.add(6, 99); //insert

        System.out.println(list);
    }
}


// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 6, Size: 5
//         at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
//         at java.base/java.util.ArrayList.add(ArrayList.java:481)
//         at R2.main(R2.java:16)
