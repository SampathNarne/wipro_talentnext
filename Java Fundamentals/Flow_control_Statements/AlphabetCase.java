class AlphabetCase {
    public static void main(String[] args) {
        char ch = 'A';
        if (Character.isLowerCase(ch)) System.out.println(ch + "->" + Character.toUpperCase(ch));
        else if (Character.isUpperCase(ch)) System.out.println(ch + "->" + Character.toLowerCase(ch));
    }
}