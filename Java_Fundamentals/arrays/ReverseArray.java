class ReverseArray {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }
        System.out.print("The given array is: ");
        for (String arg : args) System.out.print(arg + " ");
        System.out.print("\nThe reverse of the array is: ");
        for (int i = args.length - 1; i >= 0; i--) System.out.print(args[i] + " ");
    }
}