public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String res ;
        String[] word = sentence.split(" ");
        if (number > word.length){
            res =" Number = "+String.valueOf(number)+" is out Of Bound";
            return res;
        }
        res = word[number-1];
        return res;

    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int n = Integer.parseInt(number);
        int count=0;
        if(searchForEven)
        {
            while ( n >0 )
            {
                int x= (n%10);
                if (x%2 == 0) {
                    count++;
                    n= n/10;
                }
                else { n= n/10;}

            }
        }
        else {
              while (n>0)
              {
                  int x= (n%10);
                  if (x%2 == 1) {
                      count++;
                      n= n/10;
                  }
                  else { n= n/10;}

              }
        }
        return count;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {

        int check;
          check = wordA.compareTo(wordB);
          if (check > 0)
          {
              return wordB;
          }
          else {
              return wordA;
          }

    }
}
