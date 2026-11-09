public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        // TODO: implement
        if (i == j)
            return 0;
        int lenM = m.length;
        int[] distance = new int[lenM];
        for (int k = 0; k < lenM; k++)
            distance[k] = -1;
        distance[i] = 0;
        int[] queue = new int[lenM];
        queue[0] = i;
        int first = 0;
        int last = 1;
        int temp;
        while (first < last){
            temp = queue[first];
            first++;
            for (int k = 0;k < lenM; k++){
                if (m[temp][k] == 1 && distance[k] == -1){
                    distance[k] = distance[temp] + 1;
                    if (k == j)
                        return distance[k];
                    queue[last] = k;
                    last++;
                }
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}