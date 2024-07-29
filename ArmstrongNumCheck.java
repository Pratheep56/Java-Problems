import java.util.Scanner;

public class ArmstrongNumCheck{
    public static void main(String[] args){
        Scanner inpObj=new Scanner(System.in);
        System.out.println("Enter two integers:");
        int firstNum=inpObj.nextInt();
        int secondNum=inpObj.nextInt();
        int sum=0,count=0;
        System.out.println(String.format("The Armstrong numbers between the given two integers %d and %d are:",firstNum,secondNum));
        for(int i=firstNum;i<=secondNum;i++){
            int tempNum=i;
            int numDigits=String.valueOf(tempNum).length();
            while(tempNum>0){
                int dig=tempNum%10;
                sum+=(int)Math.pow(dig,numDigits);
                tempNum=tempNum/10;
            }
            if(sum==i){
              System.out.println(i);
              count++;
            }
            sum=0;
            inpObj.close();
        }
        if(count==0){
            System.out.println(String.format("Sorry, there are no Armstrong numbers between %d and %d",firstNum,secondNum));
        }
        inpObj.close();
    }
}
