class T {
    // void prepBlackTea(Water w, TeaLeaf t, Sugar s) {
    void prepTea(Water w, TeaLeaf t, Sugar s) {
        System.out.println("step 1");
        System.out.println("step 2");
        System.out.println("step 3");
    }

    // void prepMilkTea(Water w, TeaLeaf t, Sugar s, Milk m) {
    void prepTea(Water w, TeaLeaf t, Sugar s, Milk m) {
        System.out.println("step 1");
        System.out.println("step 2");
        System.out.println("step 3");
        System.out.println("step 4");
    }

    // void prepHerbalTea(Water w, Sugar s, Milk m, Herb h) {
    void prepTea(Water w, Sugar s, Milk m, Herb h) {
        System.out.println("step 1");
        System.out.println("step 3");
        System.out.println("step 4");
        System.out.println("step 5");
    }
    
    public static void main(String[] args) {
        T x = new T();

        Water w = new Water();
        Milk m = new Milk();
        TeaLeaf t = new TeaLeaf();
        Sugar s = new Sugar();
        Herb h = new Herb();

        // x.prepBlackTea(w, t, s);
        // System.out.println("++++++++++++++++++++");
        // x.prepMilkTea(w, t, s, m);
        // System.out.println("++++++++++++++++++++");
        // x.prepHerbalTea(w, s, m, h);
        x.prepTea(w, t, s);
        System.out.println("++++++++++++++++++++");
        x.prepTea(w, t, s, m);
        System.out.println("++++++++++++++++++++");
        x.prepTea(w, s, m, h);
    }    
}


class Water { }
class TeaLeaf { }
class Milk { }
class Sugar { }
class Herb { }