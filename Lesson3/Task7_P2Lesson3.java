public class Task7_P2Lesson3{
 
        public static void main(String[] args) {

       String text ="";
        for (int i = 0; i < args.length; i++) {
            text = args[i];
        }

        for(int k=0;k<text.length();k++){
            System.out.println(text.charAt(k));
        }



       
    }
}
