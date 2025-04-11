class Z2 {
    public static void main(String[] args) {
        Student a = new Student();
        
        System.out.println(a.toString());
        System.out.println(a.hashCode());

        System.out.println(Integer.toHexString(a.hashCode()));
    }    
}

class Student {

}
