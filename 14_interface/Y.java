class A {  }
class B {  }
class C {  }

// interface D extends A { }   //interface expected here

// interface D extends A,B { }    //interface expected here

// interface D extends E { }
interface D extends E,F { }

interface E { }
interface F { }