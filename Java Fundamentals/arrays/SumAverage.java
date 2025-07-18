class SumAverage {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        double avg = (double) sum / args.length;
        System.out.println("Sum = " + sum + ", Average = " + avg);
    }
}
