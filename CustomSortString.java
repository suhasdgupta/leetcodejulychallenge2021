class CustomSortString {
    public String customSortString(String order, String s) {
       StringBuffer buff = new StringBuffer();
        int[] arr = new int[26];
        for(int i = 0; i<s.length();i++){arr[s.charAt(i) - 'a']++;}
        for(int i = 0; i<order.length();i++){
            while(arr[order.charAt(i) - 'a']-->0){ buff.append(order.charAt(i)); }
        }
        for(int i = 0; i<26;i++){ 
            while(arr[i]-- > 0){ buff.append((char)(i + 'a'));}
        }
        return buff.toString();
    }
}
