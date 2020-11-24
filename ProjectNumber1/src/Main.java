public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        // interate through the string we were given, one char at a time
        for (int i=0;i<s.length();i++) {
            // save the char at the position we're at to an actual char variable
            char c = s.charAt(i);
            // if the char is one of the allowed valued, increment answer
            switch (c) {
                case 'a', 'i', 'e', 'o', 'u' -> answer++;
            }
        }

        // print and return the answer, which has a count of how many vowels we encountered
        System.out.println("Number of vowels: " + answer);
        System.out.println("----------------------------------");

        return answer;
    }

    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;

        // iterate through the string we were given, stopping 2 before the end so we don't OOB
        for (int i=0;i<s.length()-2;i++) {
            // work with a string of 3 characters, starting from our current index/position
            String c = s.substring(i, i+3);
            // if those three characters in the substr are "bob", increment the counter
            if (c.equals("bob")) answer++;
        }

        // print and return the results!
        System.out.println("Number of times bob occurs is: " + answer);
        System.out.println("----------------------------------");

        return answer;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        // we'll use this var to store the longest consecutive alphabetical substring we encounter
        String longestString = "";
        // this will be our working copy of the consecutive run
        StringBuilder substr = new StringBuilder();

        // iterate through the string, one character at a time
        for (int i=0;i<s.length();i++) {
            // if substr is empty, we're just starting out so we should input our character
            if (substr.isEmpty()) {
                substr.append(s.charAt(i));
                // check if longestString is also empty, then set it to our current substr
                if (longestString.isEmpty()) longestString = substr.toString();
            // check if the char we're on is the same or larger alphabetically as the last char in substr
            } else if (s.charAt(i) >= substr.charAt(substr.length()-1)) {
                // it is, so add this to the substr
                substr.append(s.charAt(i));
                // if our current substr is larger than our longestString, copy substr to longestString
                if (substr.toString().length() > longestString.length()) {
                    longestString = substr.toString();
                }
            // in this case, the char we're on is lower than the last char in substr, so we clear it and add this char
            } else {
                substr.setLength(0);
                substr.append(s.charAt(i));
            }
        }

        // print and return the longest alphabetical substring
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
