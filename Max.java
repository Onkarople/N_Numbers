
//import java.lang.*;
import java.util.*;

class Arryx {
    private int Arr[];

    public Arryx(int iNo) {
        Arr = new int[iNo];
    }

    public void Accept() {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter values");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            Arr[iCnt] = sobj.nextInt();
        }

    }

    public void Display() {
        int iCnt = 0;
        System.out.println("values are");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            System.out.println(Arr[iCnt]);
        }
    }

    public int Maxx() {
        int iCnt = 0;
        int itemp = Arr[iCnt];

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {

            if (Arr[iCnt] > itemp) {
                itemp = Arr[iCnt];
            }
        }

        return itemp;

    }

}

public class Max {
    public static void main(String arg[]) {
        int iRet = 0;
        System.out.println("Enter the how many elements you want");

        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Arryx obj = new Arryx(iValue);

        obj.Accept();
        obj.Display();
        iRet = obj.Maxx();
        System.out.println("Max number  is " + iRet);

        obj = null;

    }

}
