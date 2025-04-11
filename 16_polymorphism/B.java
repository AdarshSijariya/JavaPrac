class T1 {

}

class T2 extends T1 {

}

class T3 extends T2 {

}

class B {
    public static void main(String[] args) {
        Object a = new T1();
        
        Object b = new T2();
        
        Object c = new T3();
    }
}