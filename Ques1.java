public class Ques1 {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3};
        
        // Step 1: Build Prefix Sum Array
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Queries
        int[][] queries = {
            {1, 3},
            {0, 4},
            {2, 4}
        };

        // Step 2: Answer each query
        for (int[] q : queries) {
            int L = q[0];
            int R = q[1];

            int result;
            if (L == 0) {
                result = prefix[R];
            } else {
                result = prefix[R] - prefix[L - 1];
            }

            System.out.println(result);
        }
    }
}