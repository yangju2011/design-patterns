package command.jobQueue;

public class SoupCook {

    String flavor;

    public SoupCook(String flavor){this.flavor=flavor;}

    public void cook() {
        System.out.println("...\nSoup is being cooked with " + flavor + " flavor");
    }
}
