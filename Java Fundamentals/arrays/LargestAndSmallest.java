import java.util.Arrays;
class LargestAndSmallest {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Enter at least 4 numbers.");
            return;
        }
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(arr);
        System.out.println("Smallest two: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest two: " + arr[arr.length - 2] + ", " + arr[arr.length - 1]);
    }
}