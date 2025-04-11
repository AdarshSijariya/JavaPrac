class Human { }

class Player extends Human { }

class Singer extends Human {  }

class Actor extends Human {  }

class M {
    public static void main(String[] args) {
        Player a = new Player();
        Singer b = new Singer();
        Actor c = new Actor();
        
        inviteForDinner(a);
        inviteForDinner(b);
        inviteForDinner(c);
    }    

    static void inviteForDinner(Human x) {
        System.out.println("~~~ Serve Food..." + x);
    }

    // static void inviteForDinner(Player x) {
    //     System.out.println("Serve Food...");
    // }

    // static void inviteForDinner(Singer x) {
    //     System.out.println("Serve Food...");
    // }

    // static void inviteForDinner(Actor x) {
    //     System.out.println("Serve Food...");
    // }
}
