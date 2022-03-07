public class kanye {
    public static void main (String [] args){
        for(int i =1; i<=10; i++){
            for (int j=1; j<=10; j++) {
                if (i == j || i == (10 + 1) - j)
                    System.out.println("X");
                else
                    System.out.println("0");
            }
            System.out.println("");
            }
        }
    }
