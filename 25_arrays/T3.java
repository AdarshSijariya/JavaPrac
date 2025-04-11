// mohan sohan rohan

//D:/javaprac/25_arrays>java T3 mohan 12 87.45 true <Enter>

class T3 {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);

        for(int i=0;i<args.length;i++) {
            if(i == 1) {
                int v1 = Integer.parseInt(args[i]);
                System.out.println(v1 + 2);
            } else if(i == 2) {
                float v1 = Float.parseFloat(args[i]);
                System.out.println(v1 + 2);
            } else if(i == 3) {
                boolean v1 = Boolean.parseBoolean(args[i]);
                System.out.println(v1?"Hello":"hi");
                // System.out.println(args[i]?"Hello":"hi");
            } else {
                System.out.println(args[i]);
            }
        }
    }    
}
