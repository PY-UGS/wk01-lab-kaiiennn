public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, I am Kai En!");

        String modulecode = "CSC1009";
        System.out.println("Module code entered: " + modulecode);

        switch(modulecode){
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating System");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            default:
                System.out.println("Unknown Module Code!");
                break;
        }

        System.out.println();
        System.out.println("For loop to print odd numbers in descending order between 102 and 66");
        for (int x = 101; x >= 66; x=x-2){
            System.out.println("Value of x: " + x);
        }
    }
}

