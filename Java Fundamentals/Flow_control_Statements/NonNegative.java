class NonNegative {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integer arguments.");
            return;
        }

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        if (n1 % 10 == n2 % 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
