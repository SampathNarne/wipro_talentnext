class CorrespondingMonth {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter the month in numbers");
            return;
        }
        int month = Integer.parseInt(args[0]);
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else {
            System.out.println(months[month - 1]);
        }
    }
}