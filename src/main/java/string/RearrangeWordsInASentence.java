package string;

/**
 * 1451. Rearrange Words in a Sentence
 */
public class RearrangeWordsInASentence {
    public String arrangeWords(String text) {
        String[] split = text.split(" ");
        split[0] = split[0].toLowerCase();
        for (int i = 0; i < split.length; i++) {
            for (int j = i; j < split.length; j++) {
                if (split[i].length() <= split[j].length()) {
                    String temp = split[i];
                    split[i] = split[j];
                    split[j] = temp;
                }
            }
        }
        split[split.length - 1] = Character.toUpperCase(split[split.length - 1].charAt(0)) + split[split.length - 1].substring(1);
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i] + " ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new RearrangeWordsInASentence().arrangeWords("Keep calm and code on"));
    }
}
