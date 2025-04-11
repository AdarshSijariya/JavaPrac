class DiwaliPatakhaException extends RuntimeException {

}

class TigerBombException extends DiwaliPatakhaException {

}

class ChakriException extends DiwaliPatakhaException {

}

class AnardanaException extends DiwaliPatakhaException {

}

class SmokeBombException extends DiwaliPatakhaException {

}

class V {
    public static void main(String[] args) {
        try {
            if(12 > 13)
                throw new SmokeBombException();

            if(1 > 5)
                throw new ChakriException();
        } catch(DiwaliPatakhaException e) {
            System.out.println("Apply Burnol");
        } catch(SmokeBombException e) {
            System.out.println("Provide Oxygen");
        } 
    }
}