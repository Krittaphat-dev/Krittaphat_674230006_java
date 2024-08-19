package W10;

import java.util.Scanner;

public class W10_04_Titlestatus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("ระบุเพศ(male/female):");
        String gender = kb.next();

        System.out.println("ระบุอายุ:");
        int age = kb.nextInt();

        System.out.println("สถานะสมรถ(single/married):");
        String isMarried = kb.next();
        if (gender.equalsIgnoreCase("male")) {
            // ถ้าเป็นผู้ชาย เช็คว่า ด.ช. หรือ นาย
            if (age < 15) {
                System.out.println("ด.ช.");
            } else {
                System.out.println("นาย");
            }
        } else {
            // ถ้าเป็นผู้หญิง
            if (age < 15) {
                System.out.println("ด.ญ.");
            } else if (isMarried.equalsIgnoreCase("married")) {
                System.out.println("นาง");
            } else {
                System.out.println("นางสาว");
            }
        }
    }
}
