import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    static void Writefile(String str){
        try(FileWriter fw = new FileWriter("IPish.txt")){
            for(int i = 0; i < str.length(); i++){
                fw.write(str.charAt(i));
            }
        }
        catch(IOException ex){
            System.out.println(System.out);
        }
    }
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        String sp = in.nextLine();
        Pattern p = Pattern.compile("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)");
        Matcher m = p.matcher(sp);
        if(m.find()){
            Writefile(sp);
        }
        else{
            Writefile("Этот IP: "+ sp +" введён не правильно");
        }
    }
}