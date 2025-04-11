import java.util.HashSet;

class P {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set);

        set.add("mohan");
        set.add("eohan");
        set.add("tohan");
        set.add("gohan");
        set.add("rohan");
        set.add("sohan");

        String str = new String("tohan");
        System.out.println(set.contains(str));
    }
}
