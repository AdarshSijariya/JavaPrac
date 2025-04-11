class T1 {
    void iCanTalk() {
        System.out.println("I Can Talk");
    }
}

class T2 extends T1 {
    void iCanWalk() {
        System.out.println("I Can Walk");
    }
}

class T3 extends T2 {
    void iCanLaugh() {
        System.out.println("I Can Laugh");
    }
}

class F extends T3 {
    public static void main(String[] args) {
        F f = new F();

        f.iCanTalk();
        f.iCanWalk();
        f.iCanLaugh();
        f.toString();

        System.out.println(f instanceof F);
        System.out.println(f instanceof T3);
        System.out.println(f instanceof T2);
        System.out.println(f instanceof T1);
        System.out.println(f instanceof Object);
    }    
}
