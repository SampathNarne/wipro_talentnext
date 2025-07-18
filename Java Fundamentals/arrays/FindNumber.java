class FindNumber {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide array elements followed by the search element.");
            return;
        }
        int n = args.length - 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int target = Integer.parseInt(args[n]);

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}