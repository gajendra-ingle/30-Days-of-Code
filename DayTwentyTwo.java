public class DayTwentyTwo {
    public static void count(String str, int length) {

        int vowels = 0;
        int consonants = 0;
        int whitespaces = 0;

        str = str.toLowerCase(); // converting given string to lowercase

        for (int i = 0; i < length; i++) {
          char ch = str.charAt(i);
         
          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            vowels++;
          else if (ch >= 'a' && ch <= 'z') 
            consonants++;
          else if (ch == ' ')
            whitespaces++;
        }
    
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White spaces: " + whitespaces);
      }
      public static void main(String args[]) {
        String str = "Take u forward is Awesome";
        int length = str.length();
        // call the function
        count(str, length);
      }
}
