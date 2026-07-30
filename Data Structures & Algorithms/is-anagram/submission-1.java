class Solution {
    
    public boolean isAnagram(String s, String t) {
        char[] sArray = new char[s.length() ];
        char[] tArray = new char[t.length() ];

        for (int i = 0; i < s.length(); i++) {
            sArray[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            tArray[i] = t.charAt(i);
        }
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);


    }
}
