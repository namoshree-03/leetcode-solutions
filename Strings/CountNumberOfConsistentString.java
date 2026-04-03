public class CountNumberOfConsistentString {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            boolean isConsistent = true;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (allowed.indexOf(c) == -1) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}
