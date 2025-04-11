class S {
    public static void main(String[] args) {
        // String[][][] x = new String[2][3][1];
        String[][][] x = new String[][][]{{{"a"},{"b"}},{{"c"},{"d"}}};
        
        System.out.println(x instanceof String[][][]);
        System.out.println(x[0] instanceof String[][]);
        System.out.println(x[0][0] instanceof String[]);
        System.out.println(x[0][0][0] instanceof String);
        
        //Task:
        // System.out.println(x[0][0][0] instanceof String);
        // System.out.println(x[0] instanceof String[][]);
        // System.out.println(x instanceof String[][][]);
        // System.out.println(x[0][0] instanceof String[]);
    }    
}
