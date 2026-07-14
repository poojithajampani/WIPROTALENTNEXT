public class MyClassWithLambda {

    public static void main(String[] args) {

        // Implementing count() method using Lambda expression
        WordCount wc = (str) -> {

            String[] words = str.split(" ");

            return words.length;
        };

        // Calling the lambda method
        String sentence = "Java programming using lambda expression";

        int result = wc.count(sentence);

        System.out.println("Given String: " + sentence);
        System.out.println("Number of words: " + result);
    }
}
