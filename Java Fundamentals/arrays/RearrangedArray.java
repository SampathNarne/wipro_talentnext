class RearrangedArray {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        int[] result = new int[args.length];
        int idx = 0;
        for (String arg : args) {
            int val = Integer.parseInt(arg);
            if (val % 2 == 0) result[idx++] = val;
        }
        for (String arg : args) {
            int val = Integer.parseInt(arg);
            if (val % 2 != 0) result[idx++] = val;
        }
        for (int val : result) System.out.print(val + " ");
    }
}