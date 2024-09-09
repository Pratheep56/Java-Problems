import java.util.Scanner;

class Ap{
    int f,d,k,p,q;
    Ap(int f,int d,int k,int p,int q){
        this.f=f;
        this.d=d;
        this.k=k;
        this.p=p;
        this.q=q;
    }
    int nthTerm(int n){
        int a_n=f+(n-1)*d;
        return a_n;
    }


    int indexOfKthTerm(){
        for(int i=1;i<=k;i++){
            if(nthTerm(i)==k) return i;
        }
        return -1;
    }


    int absDiff(){
        return nthTerm(q)-nthTerm(p);
    }
}




public class APEx {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter first term of the AP:");
        int f=inp.nextInt();
        System.out.println("Enter common difference of the AP:");
        int d=inp.nextInt();
        System.out.println("Enter the value of n:");
        int n=inp.nextInt();
        System.out.println("Enter the value of k:");
        int k=inp.nextInt();
        System.out.println("Enter the value of p:");
        int p=inp.nextInt();
        System.out.println("Enter the value of q:");
        int q=inp.nextInt();
        Ap obj=new Ap(f,d,k,p,q);
        System.out.println();
        System.out.println("nth term of the AP: "+obj.nthTerm(n));
        System.out.println("Index of the kth term in the AP: "+obj.indexOfKthTerm());
        System.out.println("Difference between the qth and pth term of the AP: "+obj.absDiff());
        inp.close();
    }
}
