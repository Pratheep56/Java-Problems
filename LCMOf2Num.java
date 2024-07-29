import java.util.Scanner;

public class LCMOf2Num {
    public static void main(String[] args){
        Scanner inpObj=new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int x=inpObj.nextInt();
        int y=inpObj.nextInt();
        int hcf=0,lcm=0;
        int min=(x>y)?y:x;
        for(int i=1;i<=min;i++){
            if(x%i==0 && y%i==0){
                hcf=i;
            }
        }

        lcm=(x*y)/hcf;
        System.out.printf("LCM of the two integers %d and %d is %d",x,y,lcm);
        inpObj.close();
    }
}
