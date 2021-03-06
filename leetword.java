package interview;

import java.util.*;

class Solution{
public int ladderLength(String start, String end, Set<String> dict) {
    if (start == null || start.length() == 0 || 
        end == null || end.length() == 0 ||
        dict == null || dict.size() == 0) {
            return 0;
    }
    
    java.util.Queue<String> queue = new java.util.LinkedList<String>();
    queue.offer(start);
    dict.remove(start);
    int level = 1;
    
    while(!queue.isEmpty()) {
        int size = queue.size();
        for (int index = 0; index < size; index++) {
            String curr = queue.poll();
            for (int i = 0; i < curr.length(); i++) {
                char[] array = curr.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    array[i] = c;
                    String temp = new String(array);
                    if (temp.equals(end)) {
                        return level + 1;
                    }
                    
                    if(dict.contains(temp)) {
                        queue.offer(temp);
                        dict.remove(temp);
                    }
                }
            }
        }
        level++;
    }

    return 0;
}
}
public class leetword {
	public static void main(String[] args) {
	      Set<String> set1 = new HashSet<>(Arrays.asList("hot","dot"));
	      Solution s= new Solution();
	      s.ladderLength("hit","dot",set1);
	}
	

}
