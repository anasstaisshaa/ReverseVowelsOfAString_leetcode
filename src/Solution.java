class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i)))
                sb.append(s.charAt(i));
        }

        sb.reverse();
        char[] arr = sb.toString().toCharArray();
        sb.setLength(0);
        int j = 0;

        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                sb.append(arr[j]);
                j++;
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

