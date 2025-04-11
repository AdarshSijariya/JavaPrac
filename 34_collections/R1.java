import java.util.ArrayList;

class R1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        System.out.println(list);

        // list.add(5, 99); //insert
        list.set(5, 99); //replace

        System.out.println(list);
    }
}


// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.set(ArrayList.java:441)
//         at R1.main(R1.java:16)