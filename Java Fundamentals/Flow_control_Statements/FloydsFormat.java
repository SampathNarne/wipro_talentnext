class FloydsFormat {
    public static void main(String[] args) {
        int rows = 3; // You can take input here
        int k = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}