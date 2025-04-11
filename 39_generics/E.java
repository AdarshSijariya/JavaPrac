import java.util.ArrayList;

class E {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<Cat>();  //not ok

        // ArrayList<Animal> list = new ArrayList<Animal>();  //ok
    }    
}

class Animal { }
class Cat extends Animal { }


// E.java:5: error: incompatible types: ArrayList<Cat> cannot be converted to ArrayList<Animal>
//         ArrayList<Animal> list = new ArrayList<Cat>();  //not ok
//                                  ^
// 1 error