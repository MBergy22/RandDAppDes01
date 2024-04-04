package abstraction3;

public class TestMain {
    
    public static void main(String[] args) {
        String lionName = Utility.checkForName("Lion");
        Lion lionObj = Utility.getLionObject(lionName);
        lionObj.displayAll();
        System.out.println("_________________\n");
        
        String bearName = Utility.checkForName("Bear");
        Bear bearObj = Utility.getBearObject(bearName);
        bearObj.displayAll();
        System.out.println("_________________\n");
        
        String giraffeName = Utility.checkForName("Giraffe");
        Giraffe giraffeObj = Utility.getGiraffeObject(giraffeName);
        giraffeObj.displayAll();
        System.out.println("_________________\n");
    }
}
