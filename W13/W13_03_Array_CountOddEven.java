package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] args) {
        // ให้นับจำนวนเลขคู่และเลขคี่ใน Array ด้านล่าง
        int[] number = {1, 5, 6, 9, 15, 19, 30, 14, 40, 8,};

        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            if (number[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("\n Amount of All Number : " + number.length);
        System.out.println("\n Amount of Odd Number : " + countOdd);
        System.out.println("\n Amount of Even Number : " + countEven);
    }
}
