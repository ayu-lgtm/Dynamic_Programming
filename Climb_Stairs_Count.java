public class Climb_Stairs_Count {
    public static void main(String args[]){
        int n = 4;
        int arr[]=new int[n+1];
        int cp = countPath(n,arr);
        
        System.out.print(cp);
    }
    public static int countPath(int n,int arr[]){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        int num1=countPath(n-1,arr);
        int num2=countPath(n-2,arr);
        int num3=countPath(n-3,arr);
        
        int cp=num1+num2+num3;
        arr[n]=cp;
        return cp;

    }
}
