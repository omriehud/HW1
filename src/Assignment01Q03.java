public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        long firstElem = 1;
        long secondElem = 1;
        long currentNum = 0;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            if (i > 1){
                if (i % 2 == 0){
                    firstElem += secondElem;
                    currentNum = firstElem;
                }
                else{
                    secondElem += firstElem;
                    currentNum = secondElem;
                }
            }
            else
                currentNum = firstElem;
            System.out.print(currentNum);
            if (currentNum % 2 != 0)
                numOdd++;

        if (i < x - 1) 
            System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
