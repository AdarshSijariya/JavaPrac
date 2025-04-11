class I3 {
    final int x;
    final int y = 9;
    
    I3() {

    }

    public static void main(String[] args) {
        I3 i = new I3();

        System.out.println(i.x);
        System.out.println(i.y);
    }
}

// I3.java:7: error: variable x might not have been initialized
//     }
//     ^
// 1 error