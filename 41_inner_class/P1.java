class P1 {
    class Q {
        class R {
            class S {
                class T {
                    void pro() {
                        System.out.println("Hi Ji....!!!");
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        Q.R.S.T t = new P1().new Q().new R().new S().new T();

        t.pro(); 
    }
}

