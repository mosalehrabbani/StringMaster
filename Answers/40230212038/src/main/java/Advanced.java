import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
       String[] res = sentence.split(" ");
       for (int i=0 ;i < res.length ; i++)
       {
           if (Objects.equals(res[i], word))
           {
               res[i] = newWord;
           }
       }
       String result = "";
        for (int i=0 ;i < res.length ; i++)
        {
            result = result +" "+ res[i];
        }
        return result.trim();
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){

        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        String[] name1 = firstName.split("");
        String[] last1 = lastName.split("");
        name1[0] = name1[0].toUpperCase();
        last1[0] = last1[0].toUpperCase();
        String res = "" ;
        for(int i =0 ; i< name1.length ;i++)
            res += name1[i];
        res += " ";
        for(int i =0 ; i< last1.length ;i++) {
            res += last1[i];
        }
        return res.trim() ;


    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        String res ="";
        String[] word1 = word.split("");
        for (int i = 0; i < word1.length-1; i++) {
            if (Objects.equals(word1[i], word1[i + 1])) {
                word1[i] = "+";
            }
        }
        for (int i = 0; i < word1.length; i++) {
            if (!Objects.equals(word1[i], "+"))
                res += word1[i];
            else {
                continue;
            }
        }
        return res ;


    }
}

