public class StringIntroduction {

    public static void main(String[] args) {
        String word1 = "a";
        String word2 = "b";
        int a = word1.compareTo(word2);
        System.out.println("a is less than b " +a);

        word1 = "a";
        word2 = "a";
        int c = word1.compareTo(word2);
        System.out.println("a is equal to a " +c);

        word1 = "b";
        word2 = "a";
        int b = word1.compareTo(word2);
        System.out.println( "b is greater than a " + b);

        String hello = "hello";
        String java = "java";

        String concatenation = hello.substring(0,1).toUpperCase() + hello.substring(1)
                + " " + java.substring(0,1).toUpperCase() + java.substring(1);

        System.out.println(concatenation);




    }

}
