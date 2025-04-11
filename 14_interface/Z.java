class A {  }
class B {  }
class C {  }

// interface D implements A { }     //not ok
// interface D implements A,B { }   //not ok
// interface D implements E { }     //not ok
interface D implements E,F { }      //not ok

interface E { }
interface F { }