enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

class I {
    public static void main(String[] args) {
        Days[] arr = Days.values();

        for(Days day : arr) {
            System.out.println(day);    
        }
    }    
}