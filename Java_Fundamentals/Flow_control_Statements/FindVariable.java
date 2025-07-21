class FindVariable{
    public static void main(String[] args) {
        char ch = '#';
        if (Character.isAlphabetic(ch)) System.out.println("Alphabet");
        else if (Character.isDigit(ch)) System.out.println("Digit");
        else System.out.println("Special Character");
    }
}