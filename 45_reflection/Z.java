import java.util.ArrayList;

class Z {
    public static void main(String[] args) {
        // System.out.println(MNO.X.Y.class);

        Class klass = MNO.X.Y.class;

        Class parent = klass.getEnclosingClass();

        System.out.println(parent.getName());

        Class parentParent = parent.getEnclosingClass();

        System.out.println(parentParent.getName());
    }    
}
