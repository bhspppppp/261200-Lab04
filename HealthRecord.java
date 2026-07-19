public class HealthRecord {

    private int height;

    private static final int MIN_PERMITTED_HEIGHT = 30;
    private static final int MAX_PERMITTED_HEIGHT = 275;
    private static final int DEFAULT_HEIGHT = 165;

    private static int tallestHeight = MIN_PERMITTED_HEIGHT;
    private static int shortestHeight = MAX_PERMITTED_HEIGHT;

    private static int counter = 0;
    private static double averageHeight;

    public HealthRecord(int height) {
        setHeight(height);
        counter++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= MIN_PERMITTED_HEIGHT && height <= MAX_PERMITTED_HEIGHT) {
            this.height = height;
        } else {
            this.height = DEFAULT_HEIGHT;
        }

        if (this.height > tallestHeight) {
            tallestHeight = this.height;
        }
        if (this.height < shortestHeight) {
            shortestHeight = this.height;
        }

        averageHeight = (averageHeight * (counter - 1) + this.height) / counter;
    }

    public static int getTallestHeight() {
        return tallestHeight;
    }

    public static int getShortestHeight() {
        return shortestHeight;
    }

    public static double getAverageHeight() {
        return averageHeight;
    }

    public String getDetails() {
        return "Height (cm): " + getHeight();
    }

    public static String getClassDetails() {
        return "The tallest height (cm): " + getTallestHeight() + "\n" +
               "The shortest height (cm): " + getShortestHeight() + "\n" +
               "The average height (cm): " + getAverageHeight();
    }
}
