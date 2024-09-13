public class StringReversing {

    public static void reverseWords(char[] strArr, String str){

      int start = 0;

      for(int end = 0; end < strArr.length; end++){
            if (strArr[end] == ' ') {
                reverse(strArr, start, end - 1);
                start = end + 1;
            }
            
      }
      reverse(strArr, start, str.length()-1);
      reverse(strArr, 0, str.length()-1);

    }

    public static void reverse(char[] strArr, int start, int end){
      
        while (start < end) {
            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        
        String str = "My Name is Aniket Dhiwar";

        char[] strArr = str.toCharArray();

        StringReversing.reverseWords(strArr, str);
        System.out.println(strArr);
    }
}