import java.util.logging.*;

public class task_2 {

    public static void main(String[] args) {
        

        int[] array = new int[] {64, 42, 73, 41, 31, 16}; 
        printArray(array);

        for (int  i = 1; i< array.length; i++) {
            if (array[i] < array[i-1]) {
                int  x = array[i];
                array[i] = array[i-1];
                array[i-1] = x;
            }
        }
            
        printArray(array);

        Logger logger = Logger.getLogger(task_2.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }

    private static void printArray(int[] array) {
    }
    
}
