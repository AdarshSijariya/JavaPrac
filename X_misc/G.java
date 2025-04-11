class G {
    public static void main(String[] args) {
        try {
            // Class t = Class.forName("java.lang.Integer");
            // Class t = Class.forName("G");
            Class t = Class.forName("com.mysql.cj.jdbc.Driver");
            // Class t = Class.forName("AAA");
            
            System.out.println(t);
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

    }    
}
