public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int numOdd = 2;
        int last1=1;
        int last2=1;
        System.err.print(last1+" "+last2+" ");
        for (int i = 2; i < x; i++) {
            int curr=last1+last2;
            if (curr%2==1)
                numOdd+=1;
            System.out.print(curr);
            last2=last1;
            last1=curr;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
