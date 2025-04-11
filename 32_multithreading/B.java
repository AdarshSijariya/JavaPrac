class B {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println("Default Thread Name: " + x.getName());
        System.out.println("Default Thread's Id: " + x.getId());
        System.out.println("Default Thread's Priority: " + x.getPriority());
    }
}