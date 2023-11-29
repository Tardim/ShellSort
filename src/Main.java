public class Main {
    public static void main(String[] args) {
        int[] intArray = {4,6,3,2,1,9,7};
        System.out.print("Input Array: " );
        //object
        Sort d = new Sort();
        d.display(intArray);
        d.printline(50);
        d.shellSort(intArray);
        System.out.print("Output Array: ");
        d.display(intArray);
        d.printline(50);
    }
    }
