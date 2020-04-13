import java.util.Scanner;

public class First {
    /**
     * Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы. На
     * одном этаже 4 квартиры. Напишите программу которая получит номер квартиры с клавиатуры, и
     * выведет на экран на каком этаже, какого подъезда расположенна эта квартира. Если такой
     * квартиры нет в этом доме то нужно сообщить об этом пользователю.
     */
    static int APARTMENTS = 36;
    static int FLOOR = 4;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr1 = new int [APARTMENTS];
        int [] arr2 = new int [APARTMENTS];
        int [] arr3 = new int [APARTMENTS];
        int [] arr4 = new int [APARTMENTS];

        int roomNum = 0;
        int a = 0;
        int b = 0;
        int entrNum = 0;

        for(int i = 0; i < APARTMENTS; i++){
            arr1[i] = i + 1;
            arr2[i] = i + 1 + APARTMENTS;
            arr3[i] = i + 1 + APARTMENTS*2;
            arr4[i] = i + 1 + APARTMENTS*3;
        }
        try {
            System.out.println("Введіть номер квартири:");
            roomNum = s.nextInt();
        } catch (java.util.InputMismatchException ime) {
            System.out.println("Невалідний символ");
            return;
        }

        if (roomNum > APARTMENTS*FLOOR || roomNum <= 0) {
            System.out.println("Такої квартири немає в цьому будинку");
            return;
        }

        for(int i = 0; i < APARTMENTS; i++){
            if(roomNum == arr1[i]){
                System.out.print("Ця квартира знаходиться у першому під'їзді");
                entrNum = 1;
            } else if(roomNum == arr2[i]){
                System.out.print("Ця квартира знаходиться у другому під'їзді");
                entrNum = 2;
            } else if(roomNum == arr3[i]){
                System.out.print("Ця квартира знаходиться у третьому під'їзді");
                entrNum = 3;
            } else if(roomNum == arr4[i]) {
                System.out.print("Ця квартира знаходиться у четвертому під'їзді");
                entrNum = 4;
            }
        }

        roomNum -= APARTMENTS * (entrNum -1);
        a = roomNum / FLOOR;
        b = roomNum % FLOOR;
        if (b > 0) {
           a++;
        }
        System.out.println(" на поверсі номер " + a);
        s.close();
    }

}
