enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

class G {
    Days x;

    public static void main(String[] args) {
        System.out.println(x);    
    }    
}



// G.java:9: error: non-static variable x cannot be referenced from a static context
//         System.out.println(x);
//                            ^
// 1 error


// https://dev.to/ankitmalikg/difference-among-casings-snake-case-vs-camel-case-vs-pascal-case-vs-kebab-case-2m8b#:~:text=Pascal%20Case%20is%20similar%20to,C%23%2C%20Java%2C%20and%20TypeScript.