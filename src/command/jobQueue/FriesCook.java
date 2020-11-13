package command.jobQueue;

public class FriesCook {

    String size;

    public FriesCook(String size){this.size=size;}

    public void cook() {
        System.out.println("...\nFries are being cooked with size "+size);
    }
}
