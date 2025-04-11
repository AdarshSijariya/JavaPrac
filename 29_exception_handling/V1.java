
class V1 {
    public static void main(String[] args) {
        try {
            if(12 > 13)
                throw new SmokeBombException();

            if(1 < 5)
                throw new ChakriException();
        } catch(SmokeBombException e) {
            System.out.println("Provide Oxygen");
        } catch(DiwaliPatakhaException e) {
            System.out.println("Apply Burnol");
        } 
    }
}