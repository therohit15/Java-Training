import java.util.*;

public class One {
    static int max(List<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(max<list.get(i)) max=list.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            list.add(scan.nextInt());
        }
        list.
        int max = max(list);
        System.out.println(max+" is the maximum element in the array.");
        scan.close();
    }
}