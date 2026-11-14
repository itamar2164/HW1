public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String str : args){
            char frst=str.charAt(0);
            int ascii= frst;
            if (ascii%5==0){
                System.err.println(frst);
            }
        }
    }
}
