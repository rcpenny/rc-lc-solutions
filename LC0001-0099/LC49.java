// Group Anagrams

@MEDIUM
@Microsoft
public class LC49 {
  
  @HashTable
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
    Map<String, List<String>> dict = new HashMap<>();
    
    for (String s : strs) {
      char[] c = s.toCharArray();
      Arrays.sort(c);
      
      String tmp = String.valueOf(c);
      
      dict.putIfAbsent(tmp, new ArrayList<>());
      dict.get(tmp).add(s);
    }
    
    for (String key : dict.keySet()) {
      result.add(dict.get(key));
    }
    
    return result;
  }
}