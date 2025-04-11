//Functional Interface

@FunctionalInterface
interface W {
    void info();
}

@FunctionalInterface
interface I extends W {
    void info(); 
}
