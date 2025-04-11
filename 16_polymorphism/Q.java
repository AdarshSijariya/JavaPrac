// class SuperHuman {
//     void iCanFly() {
//         System.out.println("iCanFly");
//     }
// }

// class SpiderMan extends SuperHuman {
//     void iCanThrowWeb() {
//         System.out.println("iCanThrowWeb");
//     }
// }

// class ShaktiMan extends SuperHuman {
//     void iCanSpin() {
//         System.out.println("iCanSpin");
//     }
// }

// class Q {
//     public static void main(String[] args) {
//         // SuperHuman sh = new ShaktiMan();
//         SuperHuman sh = new SuperHuman();

//         SpiderMan y = (SpiderMan)sh;

//         y.iCanThrowWeb();
//     }    
// }



// Exception in thread "main" java.lang.ClassCastException: class ShaktiMan cannot be cast to class SpiderMan (ShaktiMan and SpiderMan are in unnamed module of loader 'app')
//         at Q.main(Q.java:23)