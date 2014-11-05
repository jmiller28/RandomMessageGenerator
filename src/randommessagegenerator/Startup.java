package randommessagegenerator;

/**
 *
 * @author jmiller
 */
public class Startup {

    public static void main(String[] args) {
        RandomMessageGenerator randomMessageGenerator = new RandomMessageGenerator();
        System.out.println(randomMessageGenerator.getRandomMessage());
        System.out.println(randomMessageGenerator.getListCount());
        randomMessageGenerator.addMessage("\"A great many people think they are thinking when they are merely rearranging their prejudices.\" -- William James"); 
        System.out.println(randomMessageGenerator.getListCount());
        randomMessageGenerator.addMessage("\"A great many people think they are thinking when they are merely rearranging their prejudices.\" -- William James"); 
        System.out.println(randomMessageGenerator.getListCount());
        randomMessageGenerator.removeMessage("\"A great many people think they are thinking when they are merely rearranging their prejudices.\" -- William James"); 
        System.out.println(randomMessageGenerator.getListCount());
    }
}
