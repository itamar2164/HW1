public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        for (int i=0; i<Integer.parseInt(args[0]); i++){
            double curr=1.0/((double) (2*i+1));
            approxPi+=Math.pow(-1,i)*curr;
        }
        approxPi*=4;
        System.out.println(approxPi + " " + actualPi);
    }
}
