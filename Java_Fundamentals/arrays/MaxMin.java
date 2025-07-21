class MaxMin {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String arg : args) {
            int val = Integer.parseInt(arg);
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }
}
