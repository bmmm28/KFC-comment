import java.util.Scanner;

public class CalCalories {
                Scanner inputWeight = new Scanner(System.in);// ทำหลาย input กันสับสนค่าาา
                Scanner inputAmount = new Scanner(System.in);// ทำหลาย input กันสับสนค่าาา
                double result; // ของรวมแคล:คน
                double resultCal; // รวมแคลอาหาร:เมนู
                double amount; // จน.ชิ้น
                private double checkingCalorise = 0; // เอาไว้เก็บแคลรวมั้งหมด

                public double calCaloriesAll(double resultCal) { // method calCaloriseAll
                                                                 // เอาไว้รวมแคลทั้งหมดเวลากดหลายๆเมนู
                                checkingCalorise += resultCal;
                                return checkingCalorise;
                }

                public void amountMenu1() { // คิดแคลรวมของเมนู 1
                                System.out.print("amount : "); // รับค่าจน.ชิ้น
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 280; // ผลรวม = จน.ชิ้น * แคลต่อชิ้น
                                calCaloriesAll(resultCal); // เรียกใช้ method calCalorise ข้างบน พร้อมส่งค่า resultCal
                                                           // ออกไปด้วย
                                // ex.กดจนชิ้น 2 ชิ้น จะเท่ากับ 2*280 = 560 จะส่ง 560 ไปใส่ใน method
                                // calCaloriesAll แล้วเก็บใน checkingCalorise ไว้
                }

                public void amountMenu2() { // เหมือน 1 แค่เป็น 2 เหมือนจนถึง 10 อ่ะ
                                System.out.print("amount : ");
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 330;
                                calCaloriesAll(resultCal);
                }

                public void amountMenu3() {
                                System.out.print("amount : ");
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 280;
                                calCaloriesAll(resultCal);
                }

                public void amountMenu4() {
                                System.out.print("amount : ");
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 400;
                                calCaloriesAll(resultCal);
                }

                public void amountMenu5() {
                                System.out.print("amount : ");
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 230;
                                calCaloriesAll(resultCal);
                }

                public void amountMenu6() {
                                System.out.print("amount : ");
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 320;
                                calCaloriesAll(resultCal);
                }

                public void amountMenu7() {
                                System.out.print("amount : ");
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 340;
                                calCaloriesAll(resultCal);
                }

                public void amountMenu8() {
                                System.out.print("amount : ");
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 100;
                                calCaloriesAll(resultCal);
                }

                public void amountMenu9() {
                                System.out.print("amount : ");
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 350;
                                calCaloriesAll(resultCal);
                }

                public void amountMenu10() {
                                System.out.print("amount : ");
                                amount = inputAmount.nextDouble();
                                resultCal = amount * 40;
                                calCaloriesAll(resultCal);
                }

                public void calMale() { // คิดค่า แคลต่อคนของผช.
                                System.out.print("\nInput your weight : "); // รับค่านน.
                                double weight = inputWeight.nextInt();
                                result = weight * 31; // สูตร นน.* 31 --> ผช.
                                System.out.println("\n\t Calorise/day = " + result); // แสดงแคลที่ต้องใช้ใน 1 วัน
                                                                                     // ของคนนั้นๆ
                                System.out.println("\n\t Result = " + checkingCalorise); // แสดงแคลรวมของเมนูที่เลือกมา
                                if (checkingCalorise >= result) { // ถ้าแคลรวมของเมนู มากกว่า แคลที่ต้องการต่อวัน
                                                System.out.println("\t - ! - TOO MUCH - ! -\n");
                                } else { // น้อยกว่าที่ต้องการต่อวัน (ตกกะปิ แดกได้ แดกเข้าไป เกินก็แดกๆเข้าไป)
                                                System.out.println("\t ----> normal <----\n");
                                }
                }

                public void calFeale() { // คิดค่า แคลต่อคนของผญ.
                                System.out.print("\nInput your weight : "); // รับค่านน.
                                double weight = inputWeight.nextInt();
                                result = weight * 27; // สูตร นน.* 27 --> ผช.
                                System.out.println("\n\t Calorise/day = " + result); // แสดงแคลที่ต้องใช้ใน 1 วัน
                                                                                     // ของคนนั้นๆ
                                System.out.println("\t Result = " + checkingCalorise); // แสดงแคลรวมของเมนูที่เลือกมา
                                if (checkingCalorise >= result) { // ถ้าแคลรวมของเมนู มากกว่า แคลที่ต้องการต่อวัน
                                                System.out.println("\t - ! - TOO MUCH - ! -\n");
                                } else { // น้อยกว่าที่ต้องการต่อวัน (ตกกะปิ แดกได้ แดกเข้าไป เกินก็แดกๆเข้าไป)
                                                System.out.println("\t ----> normal <---- ;) -\n");
                                }
                }
}