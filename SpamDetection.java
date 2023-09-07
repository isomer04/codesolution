import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpamDetection {
     public static List<String> getSpamEmails(List<String> subjects, List<String> spam_words) {
    // Write your code here
    
    
        int spamCounter = 0;
        
        Set<String> spamSet = new HashSet<>();
        
        for(int i = 0; i< spam_words.size(); i++) {
            
            
            
           spamSet.add(spam_words.get(i).toLowerCase());

        }
        
        List<String> output = new ArrayList<>();
        
        for(int i=0; i< subjects.size(); i++) {
            spamCounter = 0;
            
            String[] subArray = subjects.get(i).toLowerCase().split(" "); 
            
            for(int j = 0; j< subArray.length; j++){
                if(spamSet.contains(subArray[j])) {
                    spamCounter++;
                }
            }
            
            if(spamCounter >= 2) {
                output.add("spam");
            } else {
                output.add("not_spam");
            }
            
            
        }
        
        return output;
        
        
        
    }

    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("I paid him paid");
        subjects.add("Summertime Sadness");

        List<String> spamWords = new ArrayList<>();
        spamWords.add("I");
        spamWords.add("Sadness");
        spamWords.add("paid");

        List<String> results = getSpamEmails(subjects, spamWords);

        for (String result : results) {
            System.out.println(result);
        }
    }
}
