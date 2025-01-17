import java.util.*;

public class BusTransport {
    public static int[] dijkstra(int[][] distMatrix, int M) {
        int[] distances = new int[M];
        Arrays.fill(distances, Integer.MAX_VALUE);  
        distances[0] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0});
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentDistance = current[0];
            int currentLocation = current[1];
            if (currentDistance > distances[currentLocation]) {
                continue;
            }
            for (int neighbor = 0; neighbor < M; neighbor++) {
                if (neighbor == currentLocation) continue;
                int newDistance = currentDistance + distMatrix[currentLocation][neighbor];
                
                if (newDistance < distances[neighbor]) {
                    distances[neighbor] = newDistance;
                    pq.offer(new int[]{newDistance, neighbor});
                }
            }
        }
        
        return distances;
    }
    public static int solve(int M, int[][] distMatrix, int[] employees, int busCapacity) {
        
        int totalBuses = 0;
        for (int i = 0; i < M-1 ; i++) {  
            int numEmployees = employees[i];
            totalBuses += Math.ceil((double) numEmployees / busCapacity);
        }
        
        return totalBuses;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt(); 
        int[][] distMatrix = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                distMatrix[i][j] = scanner.nextInt();
            }
        }
        
        int[] employees = new int[M - 1];
        for (int i = 0; i < M-1; i++) {
            employees[i] = scanner.nextInt();
        }
        
        int busCapacity = scanner.nextInt();
        
        int result = solve(M, distMatrix, employees, busCapacity);
        System.out.println(result);
        
        scanner.close();
    }
}