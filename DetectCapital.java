public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int uppercount = 0;
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 65 && ascii <= 90) {
                uppercount++;
            }
        }
        if(uppercount==n){
            return true;
        }
        if(uppercount==0){
            return true;
        }
        if (uppercount == 1) {
            char first = word.charAt(0);
            int ascii = (int) first;

            if (ascii >= 65 && ascii <= 90) {
                return true;
            }
        }
        return false;
    }
}
