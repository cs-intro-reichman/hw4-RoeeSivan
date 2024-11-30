public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
    // i will build a function that gets a string element and returns an array of words for that string.
    public static String[] words (String element)
    {
        String word1="";
        int count = 0;
        for(int j=0;j<element.length();j++)        //i will count spaces in order to check what will be the length of the array
        {
            if(element.charAt(j)==' ')
            {
                count++;
            }
        }
        String[] words = new String[count+1];
        int wordIndex=0;
        for(int i=0; i<element.length() && (wordIndex!=words.length); i++)
        {
            if(element.charAt(i)!=' ')
            {
                word1+= element.charAt(i);
            }
            else
            {
                words[wordIndex]=word1;
                word1="";
                wordIndex++;
            }

        }
        words[wordIndex]=word1; //adding last word
        return words;
    }

    public static boolean contains(String[] arr, String value) //a method that checks if a certain string is contained in a string of words
    {
        for (int i = 0; i < arr.length; i++)
        {
        if ((arr[i] != null)&&(arr[i].equals(value)))
        {
        return true;
        }
        }
        return false;
    }
    public static void printArray(String[] arr)// a function that prints arrays
    {
        for (int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1) { // Add a space only if it's not the last word
            System.out.print(" ");
        }
        }
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        //lets put all the words of each sentence into an array
        for(int i =0;i<sentences.length;i++)
        {   
            String [] words =words(sentences[i]);//returning an array of words for a particular sentence
            for(int t=0;t<keywords.length;t++)             //now i need to loop over the keywords
            {
                if(contains(words,keywords[t].toLowerCase()))
                {   
                    printArray(words);
                    System.out.println("");
                    break; //can stop checking because its already valid
                }
            }
        }
    }
}
