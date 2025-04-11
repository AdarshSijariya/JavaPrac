// no argument

//D:/javaprac/25_arrays>java U mohan kumar om sharma ram kumar <Enter>
// D:\javaprac\25_arrays>java U "mohan kumar" "om sharma" "ram kumar" <Enter>
// D:\javaprac\25_arrays>java U "mohan kumar" "om sharma" 'ram kumar' <Enter>

class U {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);

        for(String str : args) 
            System.out.println(str);
    }    
}
