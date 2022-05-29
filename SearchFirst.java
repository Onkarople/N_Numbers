
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

    public int SearchFirstx(int No) {
        int iCnt = 0;
        int iCunt = 0;

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {

            if (Arr[iCnt] == No) {
                iCunt = iCnt;
                break;

            }
        }

        return iCunt;

    }

}

public class SearchFirst {
    public static void main(String arg[]) {
        int iRet = 0;
        System.out.println("Enter the how many elements you want");

        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Arryx obj = new Arryx(iValue);

        obj.Accept();
        obj.Display();
        System.out.println("ENter number to search");
        int iFre = sobj.nextInt();
        iRet = obj.SearchFirstx(iFre);
        System.out.println("First Ocuurance  is " + iRet);

        obj = null;

    }

}
