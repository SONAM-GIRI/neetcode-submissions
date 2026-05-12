

class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find delimiter #
            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));

            j++; // move after '#'

            String word = str.substring(j, j + len);

            result.add(word);

            i = j + len;
        }

        return result;
    }
}