import java.util.*;

public class DanceRevolution {
    static final Map<String, int[]> tilePositions = new HashMap<>() {{
        put("up", new int[]{0, 1}); 
        put("down", new int[]{0, -1}); 
        put("left", new int[]{-1, 0}); 
        put("right", new int[]{1, 0}); 
    }};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  
        String[] instructions = new String[N];
        for (int i = 0; i < N; i++) {
            instructions[i] = scanner.nextLine().trim().toLowerCase(); 
        }
        int result = minMoves(instructions);
        System.out.println(result);
        
        scanner.close();
    }
    public static int minMoves(String[] instructions) {
        int n = instructions.length;
        Map<String, Integer> dp = new HashMap<>();
        for (String left : tilePositions.keySet()) {
            for (String right : tilePositions.keySet()) {
                dp.put(left + "," + right, 0);
            }
        }
        for (int i = 0; i < n; i++) {
            String targetTile = instructions[i];
            Map<String, Integer> nextDp = new HashMap<>();
            for (String key : dp.keySet()) {
                String[] positions = key.split(",");
                String left = positions[0];
                String right = positions[1];
                int currentMoves = dp.get(key);

                int leftMoveCost = calculateDistance(left, targetTile);
                String newLeftKey = targetTile + "," + right;

                nextDp.put(newLeftKey, Math.min(nextDp.getOrDefault(newLeftKey, Integer.MAX_VALUE), currentMoves + leftMoveCost));
                int rightMoveCost = calculateDistance(right, targetTile);

                
                String newRightKey = left + "," + targetTile;
                nextDp.put(newRightKey, Math.min(nextDp.getOrDefault(newRightKey, Integer.MAX_VALUE), currentMoves + rightMoveCost));
            }
            dp = nextDp;
        }
        int minMoves = Integer.MAX_VALUE;
        for (int moves : dp.values()) {
            minMoves = Math.min(minMoves, moves);
        }
        return minMoves;
    }
    public static int calculateDistance(String tile1, String tile2) {
        int[] pos1 = tilePositions.get(tile1);
        int[] pos2 = tilePositions.get(tile2);

        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }
}