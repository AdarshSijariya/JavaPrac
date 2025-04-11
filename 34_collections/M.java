import java.util.ArrayList;

class M {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("mohan");
        list.add(34);
        list.add(false);
        list.add(78.90);

        Integer o = (Integer)list.get(3);

        System.out.println(o);
    }
}


// Exception in thread "main" java.lang.ClassCastException: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')
//         at M.main(M.java:12)
