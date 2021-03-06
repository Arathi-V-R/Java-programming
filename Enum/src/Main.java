import java.util.Arrays;

public class Main {

    enum Season{
        SUMMER(1), WINTER(2),  FALL(3), SPRING(4);
        private int value;

        private Season(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Season season = Season.WINTER;

        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(season1.SPRING.ordinal());
        System.out.println(season1.SPRING.getValue());
        System.out.println(Arrays.toString(Season.values()));
    }
}
