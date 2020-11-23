public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a', 'i', 'e', 'o', 'u' -> answer++;
            }
        }

        System.out.println("Number of vowels: " + answer);
        System.out.println("----------------------------------");

        return answer;
    }

    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;

        for (int i=0;i<s.length()-2;i++) {
            String c = s.substring(i, i+3);
            if (c.equals("bob")) answer++;
        }

        System.out.println("Number of times bob occurs is: " + answer);
        System.out.println("----------------------------------");

        return answer;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        String longestString = "";
        StringBuilder substr = new StringBuilder();

        for (int i=0;i<s.length();i++) {
            if (substr.isEmpty()) {
                substr.append(s.charAt(i));
                if (longestString.isEmpty()) longestString = substr.toString();
            } else if (s.charAt(i) >= substr.charAt(substr.length()-1)) {
                substr.append(s.charAt(i));
                if (substr.toString().length() > longestString.length()) {
                    longestString = substr.toString();
                }
            } else {
                substr.setLength(0);
                substr.append(s.charAt(i));
            }
        }

        System.out.println("Longest substring in alphabetical order is: " + longestString);
        System.out.println("----------------------------------");

        return longestString;
    }



    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "azcbobobegghakl";
        problemOne(s);
        problemTwo(s);
        problemThree(s);
    }
}
