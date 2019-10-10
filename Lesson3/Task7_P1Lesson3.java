public class Task7_P1Lesson3{
 
        public static void main(String[] args) {

        String text ="";
        for (int i = 0; i < args.length; i++) {
            text = args[i];
        }
        char[] charArray = text.toCharArray();

        for (char character: charArray) {
            System.out.println(character);
        }
    }
}

   