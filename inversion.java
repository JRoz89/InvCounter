public class inversion {
    static int arr[] = new int[] {47,24,83,78,36,17,96,55};

    static int getInvCount(int n) {
        int invCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++){
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    public static void main(String[] args) {
        System.out.println("Number of inversions: " + getInvCount(arr.length));
    }
}
