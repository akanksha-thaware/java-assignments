public class Assignment2 {
    public static boolean letters(String str) {

        str = str.toLowerCase();
        boolean[] seen = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        for (boolean letter : seen) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        boolean result = letters("qwertyuiopasdfghjklzxcvbnm");
        System.out.println(result);

}
//    Time complexity: O(n)
//    Space complexity: O(1)
}
