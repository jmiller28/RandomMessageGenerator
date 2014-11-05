package randommessagegenerator;

import java.util.*;

/**
 *
 * @author jmiller
 */
public class RandomMessageGenerator {
    
    private List<String> list = new ArrayList<>();
    private String message;
    
    public RandomMessageGenerator() {
        list.add("\"Show me a good loser, and I'll show you a loser.\" -- Vince Lombardi");
        list.add("\"From Sharp minds come... pointed heads.\" -- Bryan Sparrowhawk");
        list.add("\"Whoever undertakes to set himself up as a judge of Truth and Knowledge is shipwrecked by the laughter of the gods.\" -- Albert Einstein ");
        list.add("\"Engineering without management is art.\" -- Jeff Johnson");
        list.add("\"There is nothing new under the sun, but there are lots of old things we don't know yet.\" -Ambrose Bierce ");
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.message);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RandomMessageGenerator other = (RandomMessageGenerator) obj;
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        return true;
    }
    
    public String getRandomMessage() {
        Random random = new Random(System.nanoTime());
        int i = random.nextInt(list.size());
        return list.get(i);
    }
    
    public void addMessage(String message) {
        list.add(message);
        removeDuplicates();
    }
    
    public void removeDuplicates() {
        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);
    }
    
    public void removeMessage(String message) {
        list.remove(message);
    }
    
    public int getListCount() {
        int i = list.size();
        return i;
    }
    
}
