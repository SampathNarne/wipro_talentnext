class PalindormeOrNot {
    public static void main(String[] args) {
        int num = 110011, original = num, rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (original == rev) System.out.println(original + " is a palindrome");
        else System.out.println(original + " is not a palindrome");
    }
}