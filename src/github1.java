import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by Retro on 19.10.2017.
 */
public class Solution {

    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры

        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.


        if ((nAge % 4==0) || (nAge % 100==0) || (nAge % 400==0))
            System.out.println("количество дней в году: 366");

        else

            System.out.println("количество дней в году: 365");

    }

}
