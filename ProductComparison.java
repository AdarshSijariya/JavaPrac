import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
 class Q6 {
    String id;
    String name;

    public Q6(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ProductComparison {
    public static class ComparisonResult {
        boolean isProductUpdated;
        boolean isProductAdded;
        boolean isProductRemoved;
        boolean isEqual;
        List<Q6> updatedProducts;
        List<Q6> addedProducts;
        List<Q6> removedProducts;

        public ComparisonResult() {
            updatedProducts = new ArrayList<>();
            addedProducts = new ArrayList<>();
            removedProducts = new ArrayList<>();
        }
    }

    public static ComparisonResult compareProductArrays(List<Q6> dbProducts, List<Q6> currentProducts) {
        ComparisonResult result = new ComparisonResult();

        Map<String, Q6> dbProductMap = new HashMap<>();
        for (Q6 dbProduct : dbProducts) {
            dbProductMap.put(dbProduct.id, dbProduct);
        }

        for (Q6 currentProduct : currentProducts) {
            if (dbProductMap.containsKey(currentProduct.id)) {
                Q6 dbProduct = dbProductMap.get(currentProduct.id);
                if (!dbProduct.name.equals(currentProduct.name)) {
                    result.isProductUpdated = true;
                    result.updatedProducts.add(currentProduct);
                }
            } else {
                result.isProductAdded = true;
                result.addedProducts.add(currentProduct);
            }
        }

        for (Q6 dbProduct : dbProducts) {
            if (!dbProductMap.containsKey(dbProduct.id)) {
                result.isProductRemoved = true;
                result.removedProducts.add(dbProduct);
            }
        }

        result.isEqual = !result.isProductUpdated && !result.isProductAdded && !result.isProductRemoved;
        return result;
    }

    public static void main(String[] args) {
        List<Q6> dbProducts = Arrays.asList(
                new Q6  ("1", "Apple"),
                new Q6("2", "Banana"),
                new Q6("3", "Orange")
        );

        List<Q6> currentProducts = Arrays.asList(
                new Q6("1", "Apple"),
                new Q6("2", "Pear"),
                new Q6("4", "Grapes")
        );

        ComparisonResult comparisonResult = compareProductArrays(dbProducts, currentProducts);

        System.out.println("isProductUpdated: " + comparisonResult.isProductUpdated);
        System.out.println("isProductAdded: " + comparisonResult.isProductAdded);
        System.out.println("isProductRemoved: " + comparisonResult.isProductRemoved);
        System.out.println("isEqual: " + comparisonResult.isEqual);
        System.out.println("Updated products: " + comparisonResult.updatedProducts);
        System.out.println("Added products: " + comparisonResult.addedProducts);
        System.out.println("Removed products: " + comparisonResult.removedProducts);
    }
}

