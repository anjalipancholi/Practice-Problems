package String;

import java.util.HashSet;
import java.util.Set;

public class toGoatLatin {
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String numberOfA = "";
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        for (String i : S.split(" ")) {
            numberOfA += 'a';
            if (!set.contains(i.charAt(0))) {
                i = i.substring(1) + i.charAt(0);
            }
            sb.append(i).append("ma").append(numberOfA).append(" ");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


    public static void main(String[] args) {
        new toGoatLatin().toGoatLatin("I am Anjali");
    }
}
