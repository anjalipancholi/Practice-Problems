package String;

public class RearrangeSpacesBetweenWords {
    public String reorderSpaces(String text) {
        int spaces = 0;
        StringBuilder sb = new StringBuilder();
        String[] words = text.trim().split("\\s+");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }
        if (spaces == 0 || spaces == words.length - 1) {
            return text;
        }
        if (words.length == 1) {
            sb.append(words[0]);
            while (spaces > 0) {
                sb.append(' ');
                spaces--;
            }
            return sb.toString();
        }
        int distSpace = spaces / (words.length - 1);
        int extraSpaces = spaces % (words.length - 1);

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            int tempSpace = 0;
            if (i != words.length - 1) {
                while (tempSpace < distSpace) {
                    sb.append(' ');
                    tempSpace++;
                }
            }
        }
        while (extraSpaces != 0) {
            sb.append(' ');
            extraSpaces--;
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        new RearrangeSpacesBetweenWords().reorderSpaces("    abc     ");
    }

}
