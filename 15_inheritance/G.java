interface Y {  }

class A implements Y {  }

interface T { 
    void pro();
}

interface Z extends T { }

abstract class B extends A implements Z {   }

class C extends B { }


// G.java:13: error: C is not abstract and does not override abstract method pro() in T
// class C extends B { }
// ^
// 1 error
