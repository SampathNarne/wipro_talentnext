class CorrespondingASCII {
    public static void main(String[] args) {
        for (String arg : args) {
            int ascii = Integer.parseInt(arg);
            System.out.print((char) ascii);
        }
        System.out.println();
    }
}