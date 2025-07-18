class MaximumNumber {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        System.out.print("The given array is: ");
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(args[i]);
            System.out.print(arr[i] + " ");
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("\nThe biggest number in the given array is " + max);
    }
}
