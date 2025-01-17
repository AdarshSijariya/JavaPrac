import java.util.*;

public class Cube {

    public static int calculateCommonSides(int Q, String[] queries) {
        Map<Integer, Map<String, Integer>> structure = new HashMap<>();
        for (int i = 1; i <= Q + 1; i++) {
            structure.put(i, new HashMap<>());
        }

        for (String query : queries) {
            String[] parts = query.split(" ");
            int cubeA = Integer.parseInt(parts[0]);
            int cubeB = Integer.parseInt(parts[1]);
            String direction = parts[2];

            structure.get(cubeA).put(direction, cubeB);

            String oppositeDirection = getOppositeDirection(direction);
            structure.get(cubeB).put(oppositeDirection, cubeA);
        }
        int commonSides = 0;
        Set<String> processedPairs = new HashSet<>();

        for (int cube : structure.keySet()) {
            for (Map.Entry<String, Integer> entry : structure.get(cube).entrySet()) {
                int neighbor = entry.getValue();
                String pairKey = Math.min(cube, neighbor) + "-" + Math.max(cube, neighbor);

                if (!processedPairs.contains(pairKey)) {
                    commonSides++;
                    processedPairs.add(pairKey);
                }
            }
        }

        return commonSides;
    }
    private static String getOppositeDirection(String direction) {
        switch (direction) {
            case "top":
                return "down";
            case "down":
                return "top";
            case "left":
                return "right";
            case "right":
                return "left";
            default:
                throw new IllegalArgumentException("Invalid direction: " + direction);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        scanner.nextLine();
        
        String[] queries = new String[Q];
        for (int i = 0; i < Q; i++) {
            queries[i] = scanner.nextLine();
        }
        int result = calculateCommonSides(Q, queries);
        System.out.println(result);

        scanner.close();
    }
}
