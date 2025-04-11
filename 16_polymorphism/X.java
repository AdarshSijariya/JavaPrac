interface Human { }

class Player implements Human { }

class Singer implements Human {  }

class Actor implements Human {  }

class V {
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
}
