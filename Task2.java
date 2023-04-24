import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task2 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setFormatter(sFormatter);

        int[] array = new int[] { 6, 5, 13, 22, 9, 33, 55, 7, 14, 43, 12, 99 };
        logger.log(Level.INFO, Arrays.toString(array));

        for (int out = array.length - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    int tmp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = tmp;
                }
            }
            logger.log(Level.INFO, Arrays.toString(array));
    }
}
}