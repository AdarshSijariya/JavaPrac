import java.util.ArrayList;

class N {
    @SuppressWarnings("unchecked")
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);

        Integer y = new Integer(12);

        System.out.println(y);
    }    
}


// N.java:5: error: SuppressWarnings is not a repeatable annotation type
//     @SuppressWarnings("deprecation")
//     ^
// Note: N.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// Note: N.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error