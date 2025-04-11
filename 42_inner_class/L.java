class L {
    private int a = 500;

    static void pro() {
        class X {
            void info() {
                System.out.println(a);
            }
        }

        X x = new X();
        x.info();
    }  
    
    public static void main(String[] args) {
        pro();
    }
}


// L.java:7: error: non-static variable a cannot be referenced from a static context
//                 System.out.println(a);
//                                    ^
// 1 error