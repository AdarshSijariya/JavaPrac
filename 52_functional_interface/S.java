import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("chhotabheem");
        list.add("raju");
        list.add("jaggu");
        list.add("chutki");
        list.add("indumati");

        list.forEach((x)->System.out.println("Name: " + x));
    }    
}
