class Solution 
{
    public String[] uncommonFromSentences(String A, String B) 
    {
         Map <String, Integer> map = new HashMap(); // Set hashMap that will count how many words we will get from the strings A & B.
        
         HashSet <String> set = new HashSet(); // Set hashSet so we will know how many times a word repeats itself.
                        
         for(String a : A.split(" ")) // Use split() method to convert the string into String array, (there are no other way arond it) and use foreach loop to count the words.
         {
             map.put(a, map.getOrDefault(a, 0) + 1);
         }
        
         for(String b : B.split(" ")) // Same logic as before.
         {
             map.put(b, map.getOrDefault(b, 0) + 1);
         }
                
         for(String s : map.keySet()) // Use keySet() in order to view the keys that are the map.
         {
            if(map.get(s) == 1) // While doing so, check if the number of times the word appeared in one.
            {
                set.add(s); // If so, add the word into the HashSet.
            }
         }
        return set.toArray(new String[set.size()]); // Use toArray() to convert the hashSet into new String array with the length of it equals to the size of the HashSet and return it.
		
    } // Runtime: 2 ms, faster than 75.57% of Java online submissions for Uncommon Words from Two Sentences.
      //Memory Usage: 38.9 MB, less than 31.66% of Java online submissions for Uncommon Words from Two Sentences.
}