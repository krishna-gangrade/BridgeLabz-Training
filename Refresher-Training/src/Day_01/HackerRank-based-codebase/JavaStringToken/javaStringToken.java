package Day_01.JavaStringToken;

import java.util.*;

public class javaStringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }

        String[] token = s.trim().split("[ !,?._'@]+");
        System.out.println(token.length);

        for(String tokens: token){
            System.out.println(tokens);
        }
        scan.close();
    }
}

