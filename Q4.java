import java.util.HashMap;
import java.util.Map;

public class Q4 {
    private Map<String, Integer> stock;

    public Q4() {
        stock = new HashMap<>();
    }
    public void addStock(String Name, int quantity) {
        stock.put(Name, quantity);
    }


    public boolean sellStock(String Name, int quantityToSell) {
        if (stock.containsKey(Name)) {
            int availableQuantity = stock.get(Name);
            if (availableQuantity >= quantityToSell) {
                stock.put(Name, availableQuantity - quantityToSell);
                return true;
            }
        }
        return false;
    }

    
    public boolean updateStock(String Name, int newQuantity) {
        if (stock.containsKey(Name)) {
            stock.put(Name, newQuantity);
            return true;
        }
        return false;
    }

    
    public int getStockQuantity(String Name) {
        return stock.getOrDefault(Name, -1);
    }

     public boolean deleteStock(String Name) {
        if (stock.containsKey(Name)) {
            stock.remove(Name);
            return true;
            
        }
        return false;
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        q4.addStock("AA", 10);
        q4.addStock("BB", 20);

        System.out.println( + q4.getStockQuantity("AA")); 
        System.out.println( q4.getStockQuantity("BB")); 

        q4.sellStock("AA", 5);
        System.out.println(q4.getStockQuantity("AA"));

        q4.updateStock("BB", 30);
        System.out.println(q4.getStockQuantity("BB"));

        q4.deleteStock("AA");
        System.out.println(q4.getStockQuantity("AA")); 
    }
}
