class Y1 {
    Y1() {
        System.out.println("----- Y1() ----start");
        System.out.println(this);
        System.out.println("----- Y1() ----end");
    }
}

class Y2 extends Y1 { 
    Y2() {
        System.out.println("----- Y2() ----start");
        System.out.println(this);
        System.out.println("----- Y2() ----end");
    }
}

class G extends Y2 {
    G() {
        System.out.println("----- G() ----start");
        System.out.println(this);
        System.out.println("----- G() ----end");
    }
    public static void main(String[] args) {
        // G g = new G();
        Y2 g = new Y2();
        
        System.out.println("----- main() ----start");
        System.out.println(g);
        System.out.println("----- main() ----end");
    }
}
