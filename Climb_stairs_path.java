import java.util.ArrayList;

public class Climb_stairs_path {
    public static void main(String args[]){
        int n=4;
        ArrayList<String> al =climb(n);
        System.out.print(al);
    }

    public static ArrayList<String> climb(int n){
        if(n==0){
            ArrayList<String> path=new ArrayList<>();
            path.add("");
            return path;
        }else if(n<0){
            ArrayList<String> path=new ArrayList<>();
            return path;
        }

        ArrayList<String> path1 =climb(n-1);
        ArrayList<String> path2 =climb(n-2);
        ArrayList<String> path3 =climb(n-3);

        ArrayList<String> path =new ArrayList<>();

        for(String s:path1){
            path.add(1+s);
        }
        for(String s:path2){
            path.add(2+s);
        }
        for(String s:path3){
            path.add(3+s);
        }

        //System.out.println(path);
        return path;
        
    }
}
