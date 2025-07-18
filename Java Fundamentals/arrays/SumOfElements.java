class SumOfElements {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int sum = 0;
        boolean skip = false;
        for (int val : arr) {
            if (val == 6) skip = true;
            if (!skip) sum += val;
            if (val == 7 && skip) skip = false;
        }
        System.out.println("Sum: " + sum);
    }
}