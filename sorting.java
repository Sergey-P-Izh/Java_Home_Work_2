
public class sorting {
    public static void main(String[] args) {
        int[] array = new int[] { 65, 42, 74, 21, 33 };
        printArray(array);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
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
        
    }

    private static void printArray(int[] array) {
    }

}
