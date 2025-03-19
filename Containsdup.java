//217 leet code
public class Containsdup{
    public static boolean hasDuplicate(int[] nums) {
       Set<Integer> s=new HashSet<Integer>();
       for(int num:nums)
       {
        if(s.contains(num)){
            return true;
        }
        s.add(num);

       }
       return false;
    }
}
