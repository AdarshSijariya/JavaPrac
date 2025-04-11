import java.util.Date;

class XYZ {
    private XYZ(int x, float w) throws ArrayIndexOutOfBoundsException, NumberFormatException {
        System.out.println("Hello Ji");
    }    

    public XYZ(Date date) {
        System.out.println("Hi Ji");
    }

    XYZ() throws IllegalArgumentException {
        System.out.println("Bye Ji");
    }
}
