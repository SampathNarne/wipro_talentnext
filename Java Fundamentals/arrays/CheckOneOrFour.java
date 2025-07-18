class CheckOneOrFour {
    public static void main(String[] args) {
        for (String arg : args) {
            int val = Integer.parseInt(arg);
            if (val != 1 && val != 4) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}