/**
 * @Author EmreAydin
 * @Date 2022/06/08
 */

package assignment_1;

import java.util.Scanner;

public class Assignment1 {
    static String lookingFor = "code";

    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "Welcome";
        String s3 = "Welcome";
        /*
        * Object will be created each time whenever we use 'new' keyword. In this example, object created directly initializing.
        * So, 1 object will be created simply for the first line and their reference is used for the other two lines.
        * String s1="Welcome" creates an object and store it in String pool, next time when the String s2="Welcome" initialize then JVM firstly check in String pool whether object already exists or not.
        * Since, it is existing, object will be not created.
        * */

        /*
         * Objeler 'new' keywordu kullanılarak da tanımlanabilir. Burada tanımlama sonrasında obje direk olarak oluşmuştur.
         * Bu sebepden dolayı burada yalnızca 1 obje olusmustur ve asagida kullanilan 2 degisken olusan objeninreferansını kullanmıstır.
         * String s1="Welcome" olusutrulunca String havuzuna atılır ardından ousan String s2="Welcome" JVM tarafından String havuzunda aranır bulundugu takdirde referansı atanır.
         * Bu ornekte icerdiginden dolayı yeni bir obje olusturulmaz.
         * */

        Boolean isValid = true;                                                                                         //used to get the number of input from user
        Integer numberOfInput = 0;                                                                                      //used to get the number of input from user

        while (isValid) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of words that you want to guess (enter at least 5): ");
            numberOfInput = scan.nextInt();                                                                             // gets the number of input from user
            if (numberOfInput < 5) {
                System.out.println("You can enter at least 5!");
                isValid = true;
            } else {
                isValid = false;
            }
        }

        //Since arrays contains a block of memory, size of it is fixed. Thus, how many words that will be initialized need to be entered before the instance.
        String[] inputArr = new String[numberOfInput];
        for (int ind = 0; ind < numberOfInput; ind++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the " + (ind + 1) + " word: ");
            inputArr[ind] = s.nextLine().trim();
        }
        System.out.println(isContains(inputArr));

    }

    /**
     * Returns the output of data due to including of the given static "lookingFor" value
     *
     * @Param data type is String[] and used for comparing
     * @Return String val due to the data includes the static value
     */
    private static String isContains(String[] data) {
        String result = "";
        for (String item : data) {
            if (item.contains(lookingFor)) {
                result = item;
                break;
            }
        }
        return result == "" ? "Not found" : "Tanimli value yu iceren String deger: " + result;
    }
}
