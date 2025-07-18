class RemovingTens {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        int[] result = new int[args.length];
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
            if (arr[i] != 10) {
                result[index++] = arr[i];
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}