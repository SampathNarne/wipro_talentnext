class TwoStrings {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two strings as command-line arguments.");
            return;
        }

        String str1 = args[0];
        String str2 = args[1];

        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
    }
}
