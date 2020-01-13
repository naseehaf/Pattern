public class NumberPattern {

    public static void main(String args[]) {
        System.out.print("  ");
        for(int s=1;s<10;s++){
            System.out.print(s+"  ");
        }
        System.out.println();
        System.out.print("  ");
        for(int s=1;s<10;s++){
            System.out.print("_"+"  ");
        }
        for(int i=1;i<10;i++){
            System.out.println();
            System.out.print(i+" |");


            for(int j=1;j<10;j++){
                int k = j*i;
                if(k>9){
                    System.out.print(k+" ");
                }else{
                    System.out.print(k+"  ");
                }


            }

            System.out.println();
        }
    }
}
