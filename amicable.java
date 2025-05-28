import java.util.Scanner;
class amicable{
    public static void main(String []args){
        Scanner ami = new Scanner(System.in);
        int a = ami.nextInt();
        int b = ami.nextInt();
        int sum1=0,sum2=0;
        int i,j;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum1=sum1+i;
            }
        }
            for(j=1;j<b;j++)              //sample input 220 and 284
        { 
            if(b%j==0)
            {
                sum2=sum2+j;
            }
        }
        System.out.println((sum1==b && sum2==a)?"amicable":"not amicable");
}}
