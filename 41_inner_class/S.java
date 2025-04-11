class S {
    int b = 6;
    class T {
        int b = 5;
        class U {
            int b = 4;
            class V {
                int b = 3;
                class W {
                    int b = 2;
                    void pro() {
                        int b = 1;
                        System.out.println(b);
                        System.out.println(this.b);
                        System.out.println(V.this.b);
                        System.out.println(U.this.b);
                        System.out.println(T.this.b);
                        System.out.println(S.this.b);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        S s = new S();
        T t = s.new T();
        T.U u = t.new U();
        T.U.V v = u.new V();
        T.U.V.W w = v.new W();

        w.pro(); 
    }
}

