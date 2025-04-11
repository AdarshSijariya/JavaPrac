enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

class X {
    public static void main(String[] args) {
        Days x = Days.FRIDAY;
        
        if(x instanceof Days) {
            System.out.println("YES");
        }
    }    
}
