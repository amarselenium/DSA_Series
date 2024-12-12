/***
 * Created By: AmareshRout
 * Date: 31/05/23
 * Project Name: NagarroTest
 */

package StringProblems;

public class RemoveVowels {

    public static void main(String[] args) {
        String str="My name is Amaresh Kumar Rout";
         char[] s = str.toCharArray();
        String withoutvowel="";
         for (int i=0;i<s.length;i++)
        {

            if(s[i]=='a'||s[i]=='A'|| s[i]=='e'||s[i]=='E'|| s[i]=='i'||s[i]=='I'|| s[i]=='o'||s[i]=='O'|| s[i]=='u'||s[i]=='U')
            {
                s[i]=Character.MIN_VALUE;
            }
          withoutvowel=withoutvowel+s[i];
        }
        System.out.println(withoutvowel);
    }

}
