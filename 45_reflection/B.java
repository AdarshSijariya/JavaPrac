class B {
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        Class klass = emp.getClass();

        System.out.println(klass);
        System.out.println(klass.getName());
    }
}


