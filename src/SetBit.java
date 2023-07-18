import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextByte();
        int B = sc.nextInt();
        if(A==B)
        {
            System.out.println(caculatePow(A));
        }
        else
        System.out.println(caculatePow(A)+caculatePow(B));
    }
    public static int caculatePow(int A)
    {
        if(A==0)
            return 1;
        return 2 * caculatePow(A-1);
    }
}
//just calculate 2^A + 2^B 
//if both equal 2^A;
