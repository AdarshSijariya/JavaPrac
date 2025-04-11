class B {
    int a;
    int b;
    B(int x, int y){
        a=x;
        b=y;
    }

    int add(){
        int result = a+b;
        return result;
    }
    int sub(){
        int result = a-b;
        return result;
    }
    int mull(){
        int result = a*b;
        return result;
    }
    public static void main(String[] args){
        B obj = new B(4,6);
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mull());
    }
}
// Parameterized constructor