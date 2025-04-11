class A{
   /*static+*/void hello(){
        System.out.println("hello there ");
    }
    public static void main (String []args){
        hello();
    }
}
// without static it will generate an error becouse non static member cannot be called from static member of class
// with static :- hello there 