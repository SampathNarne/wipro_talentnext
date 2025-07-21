import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        for (String arg : args) {
            set.add(Integer.parseInt(arg));
        }
        System.out.println(set);
    }
}