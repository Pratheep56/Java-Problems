import java.util.Scanner;

public class SquareStarPattern{
    public static void main(String[] args){
        Scanner inpObj=new Scanner(System.in);
        System.out.println("Enter length and width of the Square/Rectangle: ");
        int len=inpObj.nextInt();
        int wid=inpObj.nextInt();
        for(int i=1;i<=len;i++){
            for(int j=1;j<=wid;j++){
                if(i==1 || i==len){
                    System.out.print("*");
                }else{
                    if(j==1 || j==wid){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        inpObj.close();
    }
}
