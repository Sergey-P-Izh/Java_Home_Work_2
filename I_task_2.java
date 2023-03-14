import java.util.logging.*;

public class I_task_2 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(I_task_2.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        SimpleFormatter sFormat = new SimpleFormatter();
        logger.addHandler(ch);
        ch.setFormatter(sFormat);
        logger.info("Тестовое логирование");




        int[] array = new int[] {64, 42, 73, 41};

        printArray(array);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]) {
                    int temp = array[i];
                    array[i] =  array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
            printArray(array);
        }

        
    }

    private static void printArray (int[] arr) {
        System.out.print("\r \n ");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
    }
   


}