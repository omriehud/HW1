public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01
       for (String word : args){
            char letter = word.charAt(0);
            if ((int) letter % 5 == 0){
                System.out.println(letter);
            }
       }
    }
}
