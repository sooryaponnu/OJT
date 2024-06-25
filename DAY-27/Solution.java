import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class WordNode {
    String word;
    int numSteps;
    WordNode pre;
    
    public WordNode(String word, int numSteps, WordNode pre) {
        this.word = word;
        this.numSteps = numSteps;
        this.pre = pre;
    }
}

public class Solution {
    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> result = new ArrayList<>();

        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(start, 1, null));
        dict.add(end);
        
        int minStep = 0;
        HashSet<String> visited = new HashSet<>();
        HashSet<String> unvisited = new HashSet<>(dict);
        
        int preNumSteps = 0;
        
        while (!queue.isEmpty()) {
            WordNode top = queue.remove();
            String word = top.word;
            int currNumSteps = top.numSteps;
            
            if (word.equals(end)) {
                if (minStep == 0) {
                    minStep = top.numSteps;
                }
                if (top.numSteps == minStep && minStep != 0) {
                    ArrayList<String> t = new ArrayList<>();
                    t.add(top.word);
                    while (top.pre != null) {
                        t.add(0, top.pre.word);
                        top = top.pre;
                    }
                    result.add(t);
                    continue;
                }
            }
            
            if (preNumSteps < currNumSteps) {
                unvisited.removeAll(visited);
            }
            preNumSteps = currNumSteps;
            
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = arr[i];
                    if (arr[i] != c) {
                        arr[i] = c;
                    }

                    String newWord = new String(arr);
                    if (unvisited.contains(newWord)) {
                        queue.add(new WordNode(newWord, top.numSteps + 1, top));
                        visited.add(newWord);
                    }
                    arr[i] = temp;
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String start = "hit";
        String end = "cog";
        Set<String> dict = new HashSet<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));

        List<List<String>> results = solution.findLadders(start, end, dict);
        for (List<String> path : results) {
            System.out.println(path);
        }
    }
}
