
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

    public int SearchLastx(int No) throws Exception {
        int iCnt = 0;

        for (iCnt = (Arr.length - 1); iCnt >= 0; iCnt--) {

            if (Arr[iCnt] == No) {
                break;

            }
        }

        return iCnt;

    }

}

public class SearchLast {
    public static void main(String arg[]) throws Exception {
        int iRet = 0;
        System.out.println("Enter the how many elements you want");

        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Arryx obj = new Arryx(iValue);

        obj.Accept();
        obj.Display();
        System.out.println("ENter number to search");
        int iFre = sobj.nextInt();
        iRet = obj.SearchLastx(iFre);
        System.out.println("last Ocuurance  is " + iRet);

        obj = null;

    }

}
