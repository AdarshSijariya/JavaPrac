enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

class X1 {
    public static void main(String[] args) {
        Days x = Days.FRIDAY;
        
        if(x instanceof Object) {
            System.out.println("YES");
        }
    }    
}
