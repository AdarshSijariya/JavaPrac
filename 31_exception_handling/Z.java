class Z {
    static int i;

    public static void main(String[] args) {
        pro();
    }   
    
    static void pro() {
        System.out.println(i++);
        pro();
    }
}



// .
// .
// .
// .
// 9648
// 9649
// 9650
// 9651
// 9652
// Exception in thread "main" java.lang.StackOverflowError
//         at java.base/sun.nio.cs.StreamEncoder.implWrite(StreamEncoder.java:281)
//         at java.base/sun.nio.cs.StreamEncoder.write(StreamEncoder.java:125)
//         at java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:208)
//         at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:120)
//         at java.base/java.io.PrintStream.write(PrintStream.java:605)
//         at java.base/java.io.PrintStream.print(PrintStream.java:676)
//         at java.base/java.io.PrintStream.println(PrintStream.java:812)
//         at Z.pro(Z.java:9)
//         at Z.pro(Z.java:10)
//         at Z.pro(Z.java:10)
// .
// .
// .
// .