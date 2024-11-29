public class MyString {
    public static void main(String[] args) {
        
        boolean test1 = MyString.contains("baba yaga", "baba");
        boolean test2 = MyString.contains("baba yaga", "");
        boolean test3 = !MyString.contains("baba yaga", "John Wick is the baba yaga");
        boolean test4 = !MyString.contains("baba yaga", "Yaga");
        boolean test5 = !MyString.contains("baba yaga", "babayaga");

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);

        

    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // 
        String s1="";
        char[] con = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Convert to lowercase
            if (c >= 'A' && c <= 'Z') 
            {
                con[i] = (char) (c + 32);
            } else 
            {
                con[i] = c; // letters that are not capital letters i leave as is
            }
        }
    
        // Convert char array to a string
        for (int j = 0; j < str.length(); j++) {
            s1 = s1 + con[j];
        }
        return s1;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.isEmpty())
        {
            return true;
        }
    
        if (str2.length() > str1.length()) 
        {
            return false;
        }
    
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean match = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) 
            {
                return true; // match found
            }
        }
    
        return false; // no match found
    }
}
    
      

