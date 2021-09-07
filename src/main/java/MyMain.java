public class MyMain {
    // Takes two Strings as input, and returns a String equal to the first half
    // of the shorter String plus the second half of the longer String.
    public static String halfAdder(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();
        if (a>b){
            int c = a/2;
            int d = b/2;
            String e = str1.substring(c,a);
            String f = str2.substring(0,d);
            return (f+e);
        }
        else{
            int c = a/2;
            int d = b/2;
            String e = str1.substring(0,c);
            String f = str2.substring(d,b);
            return (e+f);
        }

    }

    // Takes a String as input, and returns true if the String contains an 'A' or 'a'
    // and returns false otherwise
    public static boolean checkIfA(String str) {
        int x = str.indexOf("A");
        int y = str.indexOf("a");
        if (x != -1 || y != -1){ //(x == -1 && y == -1) would also work changing return true and false around. return false if cant find both of them
            return true;
        }
        else{
            return false;
        }
    }

    //  Takes in two Strings as input and returns a String equal to those two Strings added
    //  together in alphabetic order.
    public static String stringOrder(String str1, String str2) {
        return "";
    }


    public static void main(String[] args) {
        // Some code to test halfAdder
        System.out.println("halfAdder tests:");
        System.out.println(halfAdder("computer","science")); // sciuter
        System.out.println(halfAdder("apple","fig")); // fple
        System.out.println(halfAdder("banana","boat")); // boana
        System.out.println(halfAdder("crablike","pineapple")); // crabapple
        System.out.println(halfAdder("trombone", "hippie")); // hipbone

        // Some code to test checkIfA
        System.out.println("\ncheckIfA tests:");
        System.out.println(checkIfA("asdf")); // true
        System.out.println(checkIfA("bAnAnA")); // true
        System.out.println(checkIfA("fig")); // false

        // Some code to test stringOrder
        System.out.println("\nstringOrder tests:");
        System.out.println(stringOrder("apple", "banana")); // applebanana
        System.out.println(stringOrder("banana", "apple")); // applebanana
        System.out.println(stringOrder("cranberry", "banana")); // bananacranberry
        System.out.println(stringOrder("apple", "Banana")); // appleBanana
        System.out.println(stringOrder("Cranberry", "apple")); // appleCranberry
    }
}