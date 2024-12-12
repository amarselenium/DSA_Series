/***
 * Created By: AmareshRout
 * Date: 22/05/23
 * Project Name: NagarroTest
 */

public class Day1 {
    public static void main(String[] args) {
        countWordsWithOutSplit("        My Test         is         going   India   ");
        countofWordsSplit("        My Test         is         going   India   ");
    }


    public static void countWordsWithOutSplit(String sentence) {
        sentence = sentence.trim();
        if (sentence.trim().length() > 0) {
            int l = sentence.length();
            int count = 1;
            for (int i = 0; i < l - 1; i++) {
                if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') {
                    count++;
                }
            }
            System.out.println("Total words" + " " + count);
        }

    }
    public  static void countofWordsSplit(String senetence)
    {
        senetence = senetence.trim();
        String[] s = senetence.split(" ");
        System.out.println(s.length);
    }

}

