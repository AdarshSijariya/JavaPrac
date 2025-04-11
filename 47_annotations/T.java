@interface Mno {

}

@Mno
class Y1 {

}

class T {
    public static void main(String[] args) {
        Class klass = Y1.class;
        
        Object obj = klass.getAnnotation(Mno.class);

        System.out.println(obj);
    }    
}
