import java.util.Date;

public final /*abstract*/ class Teacher extends User implements AAA,BBB,CCC {
    transient String qualification;
    float salary;

    private String interest;
    private int experience;

    /*static final*/ public Date dob = new Date();
    /*static*/ public String section;

    // public abstract void _pro(int x);
    
    public static void _info(String y, float w, boolean z) {

    }

    public final synchronized String _getQualification(java.util.Date dt) throws ArrayIndexOutOfBoundsException, ClassCastException {
        return qualification;
    }

    public final float _getSalary(Float w) throws ArrayStoreException, NullPointerException, NegativeArraySizeException {
        return salary;
    }

    String _getInterest(AAA w, BBB q, CCC s)   {
        return interest;
    }

    int _getExperience() {
        return experience;
    }

    private Date _getDob() {
        return dob;
    }

    private void _setDob(Date dob) {
        this.dob = dob;
    }

    public Teacher(String qualification, float salary, String interest, int experience, Date dob, String section) {
        this.qualification = qualification;
        this.salary = salary;
        this.interest = interest;
        this.experience = experience;
        this.dob = dob;
        this.section = section;
    }
}




// transient - java.lang.String - qualification = PHd
//  - float - salary = 2500000.5
// Exception in thread "main" java.lang.IllegalAccessException: class M cannot access a member of class Teacher with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:361)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:591)
//         at java.base/java.lang.reflect.Field.checkAccess(Field.java:1075)
//         at java.base/java.lang.reflect.Field.get(Field.java:416)
//         at M.main(M.java:16)