import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.remove(0);
        
        System.out.println(" +++++++++++++++++ ");


        //Warnings:

        // Note: A.java uses unchecked or unsafe operations.
        // Note: Recompile with -Xlint:unchecked for details.

        // list.add(12);
        list.set(0, 100);
    }
}