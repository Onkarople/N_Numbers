
#include<iostream>
using namespace std;


class Arryx
{

    private:
    int iSize;
    int *Arr;

    public :
     Arryx(int iValue)     //parametrised consturtor
    {
         this->iSize=iValue;
         Arr=new int[iSize];       //allocate the rescources
    }
      

    ~Arryx()                 // desctructor
    {
        delete []Arr;           //deallocate the resources
    }


    void Accept()
    {
        int iCnt=0;
        cout<<"enter the elemets"<<endl;
         for(iCnt=0;iCnt<iSize;iCnt++)
       {
          cin>>Arr[iCnt];
       }
    }

    void Display()
    {
        int iCnt=0;
        cout<<"Elemnts are\n";
        for( iCnt=0;iCnt<iSize;iCnt++)
        {
            cout<<Arr[iCnt]<<endl;
        }
    }

    int SearchFirst(int No)
    {
        int iCnt=0,iCount=0;
        int iTemp=0;
        for( iCnt=0;iCnt<iSize;iCnt++)
        {
             if(Arr[iCnt]==No)
             {
               iCount=iCnt;
               break;
             }
        }   
        return iCount;

    }
    

};


int main()
{
     int iRet=0;
     int iValue=0;
     int iNo=0;
     cout<<"Enter how many elemnts you want\n";
     cin>>iValue;

     Arryx aobj(iValue);

     aobj.Accept();
     aobj.Display();

     cout<<"Eneter number to sarch\n";
     cin>>iNo;
     iRet=aobj.SearchFirst(iNo);

     cout<<"first occurance is:"<<iRet<<endl;
     
    return 0;
}