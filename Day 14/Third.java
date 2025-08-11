import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int players = scan.nextInt();
        scan.nextLine();
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=players; i++){
            list.add(i);
        }
        String position = scan.nextLine().toLowerCase();
        int[] deletepos = new int[position.length()];
        for (int i = 0; i < deletepos.length; i++) {
            if(position.charAt(i)=='y'){
                deletepos[i]=1;
                continue;
            }
            deletepos[i]=0;
        }
        
        ArrayList<Integer> toRemove = new ArrayList<>(Arrays.asList(0));
        // int size = position.length();
        // int eliminate = position.indexOf("y");
        // int deleteinc = size-eliminate;
        // while(list.size()>2){
        //     if(eliminate>=list.size()){
        //         eliminate=0; 
        //         eliminate+=deleteinc;
        //         continue;
        //     }
        //     list.remove(eliminate);
        //     eliminate+=deleteinc;
        //     System.out.println(list);
        // }
        while(list.size()>2){
            for(int i=0; i<list.size(); i++){
                if(deletepos[i]==1 && deletepos[i]!=0){
                    list.set(i,0);
                }
                if(deletepos[i]!=0)break;
            }
            list.removeAll(toRemove);
        }
        System.out.println(list.get(0));
        scan.close();
    }
}
