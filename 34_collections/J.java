import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        
        list.add(12);
        list.add(78);
        list.add(34);
        list.add(12);
        list.add(57);
        list.add(2);
        list.add(12);
        
        System.out.println(list);

        list.remove(12);

        System.out.println(list);
    }    
}



// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 12 out of bounds for length 7
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:504)
//         at J.main(J.java:18)

