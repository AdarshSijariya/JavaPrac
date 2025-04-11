class P {
    class Q {
        class R {
            class S {
                class T {
                    void pro() {
                        System.out.println("Hello Ji....!!!");
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        P p = new P();
        Q q = p.new Q();
        Q.R r = q.new R();
        Q.R.S s = r.new S();
        Q.R.S.T t = s.new T();

        t.pro(); 
    }
}

