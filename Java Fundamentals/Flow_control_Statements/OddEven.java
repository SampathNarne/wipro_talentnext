class OddEven {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            if (num % 2 == 0) {
                System.out.println("Given number is Even");
            } else {
                System.out.println("Given number is Odd");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input!");
        }
    }
}
