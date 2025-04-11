enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

class H1 {
    public static void main(String[] args) {
        Days x = Days.FRIDAY;
        System.out.println(x);    
    }    
}



/*

enum Days {
    static final Days MONDAY = new Days(0, "MONDAY"),
    static final Days TUESDAY = new Days(1, "TUESDAY"),
    .
    .
    .
}

 */