import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    static Scanner console = new Scanner(System.in);
    public static String result;
    public static String calc1(String a, String b) {

        String ex = console.nextLine().replaceAll(" ", "");

        String[] s = a.split("[+\\-*/]");

        char action;
        int c;
        for (int i = 0; i < s.length; i++) {
            if (ex.contains("+")) {

                 s = ex.split("\\+");

                action = '+';
                for (int k = 0; k < s.length; k++) {

                    s[k] = s[k].replace("\"", "");

                }
                if (new Scanner(s[0]).hasNextInt() || new Scanner(s[1]).hasNextInt()) {

                    System.exit(0);
                }

                if (s[0].length()>10 || s[1].length()>10) {
                    System.exit(0);
                }

                String result = s[0] + s[1];

                if(result.length()>40){
                    result = result.substring(0, 40);
                    System.out.println("\"" + result + "..." + "\"");
                    System.exit(0);
                }

                System.out.println("\"" + result + "\"");
                System.exit(0);
            } else if (ex.contains("-")) {
                s = ex.split("-");

                action = '-';
                for(int k=0; k<s.length;k++){
                    s[k]=s[k].replace("\"", "");
                }

                if (new Scanner(s[0]).hasNextInt() || new Scanner(s[1]).hasNextInt()) {

                    System.exit(0);
                }

                if (s[0].length()>10 || s[1].length()>10) {
                    System.exit(0);
                }

                int n = s[0].indexOf(s[1]);
                if(n == -1) {
                    System.out.println(s[0]);
                    System.exit(0);
                }
                result= s[0].substring(0,n);
                result=result+s[0].substring(n+s[1].length());

                if(result.length()>40){
                    result = result.substring(0, 40);
                    System.out.println("\"" + result + "..." + "\"");
                    System.exit(0);
                }

                System.out.println("\"" + result + "\"");
                System.exit(0);
            } else if (ex.contains("/")) {
                s = ex.split("/");
                action = '/';

                if (action == '*' || action == '/') {
                    if (s[1].contains("\""))
                        System.exit(0);
                    if (new Scanner(s[0]).hasNextInt()) {

                        System.exit(0);
                    }
                    for(int k=0; k<s.length;k++){
                        s[k]=s[k].replace("\"", "");
                    }



                     if (s[0].length()>10 || s[1].length()>10) {
                        System.exit(0);
                    }

                   if (Integer.parseInt(s[1])==(int)Integer.parseInt(s[1])){

                     if(Integer.parseInt(s[1])>10 || Integer.parseInt(s[1])<1){
                    System.exit(0);
                     }
                   }

                    int m = s[0].length() / Integer.parseInt(s[1]);
                    result = s[0].substring(0, m);

                    if(result.length()>40){
                        result = result.substring(0, 40);
                        System.out.println("\"" + result + "..." + "\"");
                        System.exit(0);
                    }
                  //  result=result+s[0].substring(m+s[1].length());  ///
                    System.out.println("\"" + result + "\"");
                    System.exit(0);
                }
            } else if (ex.contains("*")) {
                s = ex.split("\\*");
                action = '*';
                if (action == '*' || action == '/') {
                    if (s[1].contains("\""))
                        System.exit(0);
                }

                if (new Scanner(s[0]).hasNextInt() ) {

                    System.exit(0);
                }

                for(int k=0; k<s.length;k++){
                    s[k]=s[k].replace("\"", "");
                }



                if(Integer.parseInt(s[1])>10 || Integer.parseInt(s[1])<1){
                    System.exit(0);
                } else if (s[0].length()>10 || s[1].length()>10) {
                    System.exit(0);
                }

                c = Integer.parseInt(s[1]);
                result = "";

                for(i =0; i < c; i++){
                    result=result+s[0];
                }
               if(result.length()>40){

                   result = result.substring(0, 40);

                    System.out.println("\"" + result + "..." + "\"");
                    System.exit(0);
                }
                System.out.println("\"" + result + "\"");
                System.exit(0);
            }




        }
        return result;

    }

    public static void main(String[] args) throws IOException {


        //Converter converter = new Converter();
        System.out.println("Введите строку операции: ");

        System.out.println(calc1("",result));
    }








}