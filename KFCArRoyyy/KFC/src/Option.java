import java.util.Scanner;

public class Option extends CalCalories { // Option สืบทอดมาจาก Calorise (super class)
       Scanner SelectInput = new Scanner(System.in);
       Scanner inputWeight = new Scanner(System.in);
       int selectChoice;

       public void getSelectMenu() {
              System.out.println("\t =========================================================================");
              System.out.println("\t |                                  KFC                                  |");
              System.out.println("\t |                              SELECT MENU                              |");
              System.out.println("\t =========================================================================");
              System.out.println("\t | 1.Tender Classic Fried Chicken(Thigh)    | Calorie/Piece => 280 cal.  |");
              System.out.println("\t | 2.Tender Classic Fried Chicken(Breast)   | Calorie/Piece => 330 cal.  |");
              System.out.println("\t | 3.Tender Classic Fried Chicken(Drumstick)| Calorie/Piece => 280 cal.  |");
              System.out.println("\t | 4.Tender Classic Fried Chicken(Backbone) | Calorie/Piece => 400 cal.  |");
              System.out.println("\t | 5.Tender Classic Fried Chicken(Wing)     | Calorie/Piece => 230 cal.  |");
              System.out.println("\t | 6.Hot & Spicy Fried(Thigh)               | Calorie/Piece => 320 cal.  |");
              System.out.println("\t | 7.Hot & Spicy Fried(Breast)              | Calorie/Piece => 340 cal.  |");
              System.out.println("\t | 8.WingZ Zabb                             | Calorie/Piece => 100 cal.  |");
              System.out.println("\t | 9.French Fried(Jumbo)                    | Calorie/Size  => 350 cal.  |");
              System.out.println("\t | 10.Pepsi                                 | Calorie/Glass => 40 cal.   |");
              System.out.println("\t =========================================================================");
              System.out.print("\nSelect menu : "); // รับค่าเมนู

              selectChoice = SelectInput.nextInt();

              switch (selectChoice) {
              case 1:
                     amountMenu1(); // อยู่ใน CalCalorise (ที่ extend มาอ่ะ)
                     getAddMenu(); // (อยู่ข้างล่างจ้าา)
                     break;
              case 2:
                     amountMenu2();
                     getAddMenu();
                     break;
              case 3:
                     amountMenu3();
                     getAddMenu();
                     break;
              case 4:
                     amountMenu4();
                     getAddMenu();
                     break;
              case 5:
                     amountMenu5();
                     getAddMenu();
                     break;
              case 6:
                     amountMenu6();
                     getAddMenu();
                     break;
              case 7:
                     amountMenu7();
                     getAddMenu();
                     break;
              case 8:
                     amountMenu8();
                     getAddMenu();
                     break;
              case 9:
                     amountMenu9();
                     getAddMenu();
                     break;
              case 10:
                     amountMenu10();
                     getAddMenu();
                     break;
              default: // ถ้าไม่ใช่ 1-10
                     System.out.println("!!!! PLEASE SELECT MENU !!!!");
                     getSelectMenu(); // แสดงเมนูขึ้นมาใหม่

              }

       }

       public void getAddMenu() {
              System.out.println("\t =====================================");
              System.out.println("\t |             1.Add Menu            |");
              System.out.println("\t |             2.Next Step           |");
              System.out.println("\t =====================================");
              System.out.print("\nEnter : "); // รับค่าตัวเลือก

              selectChoice = SelectInput.nextInt();

              switch (selectChoice) {
              case 1:
                     getSelectMenu(); // เมนู
                     break;
              case 2:
                     getSelectGender(); // เลือกเพศ
                     break;
              default: // ไม่ใช่ 1-2
                     System.out.println("!!!! PLEASE SELECT !!!!");
                     getAddMenu(); // เรียกอันนี้ใหม่
              }
       }

       public void getSelectGender() {
              System.out.println("\t =====================================");
              System.out.println("\t |     PLEASE SELECT YOUR GRNDER     |");
              System.out.println("\t =====================================");
              System.out.println("\t |              1. Male              |");
              System.out.println("\t |             2. Female             |");
              System.out.println("\t =====================================");
              System.out.print("\nEnter : "); // รับค่า

              selectChoice = SelectInput.nextInt();

              switch (selectChoice) {
              case 1:
                     calMale(); // อยู่ใน CalCalorise
                     break;

              case 2:
                     calFeale(); // อยู่ใน CalCalorise
                     break;

              default: // ไม่ใช้ 1-2
                     System.out.println("\n\t!!!!!!!! PLEASE SELECT YOUR GRNDER !!!!!!!!");
                     getSelectGender();
              }

       }
}
