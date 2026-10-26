public class HealthRecord {

    private int height;

    private static final int MIN_PERMITTED_HEIGHT = 30;
    private static final int MAX_PERMITTED_HEIGHT = 275;
    private static final int DEFAULT_HEIGHT = 165;

    private static int tallestHeight = MIN_PERMITTED_HEIGHT;
    private static int shortestHeight = MAX_PERMITTED_HEIGHT;

    private static int counter = 0;       // count number of objects
    private static double averageHeight;  // track average height

    public HealthRecord(int height) {
        counter++;
        this.setHeight(height);
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        // Validation: use the default height when the input is out of range
        if (height >= MIN_PERMITTED_HEIGHT && height <= MAX_PERMITTED_HEIGHT) {
            this.height = height;
        } else {
            this.height = DEFAULT_HEIGHT;
        }

        // Track tallest/shortest from the stored height, so the default height
        // of an invalid input (even the first student) is counted too
        if (this.height > tallestHeight) {
            tallestHeight = this.height;
        }
        if (this.height < shortestHeight) {
            shortestHeight = this.height;
        }

        // Update average using y' = (y*n + x)/(n+1)
        // n = number of records before this one, so n + 1 equals counter
        // For the first student n = 0, so the average becomes x
        int n = counter - 1;
        averageHeight = (averageHeight * n + this.height) / counter;
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

    public static void displayClassDetails() {
        System.out.println("The tallest height (cm): " + getTallestHeight());
        System.out.println("The shortest height (cm): " + getShortestHeight());
        System.out.printf("The average height (cm): %.2f%n", getAverageHeight());
    }

}
