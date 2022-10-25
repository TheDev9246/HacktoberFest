package Driver;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Driver{
static void Writing(Tollboot obj)
    {
       
    /**Used to read The File on Disk
     * @param obj to handle Tollboot class
     */
    static void reading(Tollboot obj,Receipt recobj)
    {

    public static void main(String[] args) {
        Car c1=new Car();
       Receipt receipt = new Receipt();
        Tollboot tollboot = new Tollboot("Sialmor Toolplaza");
        tollboot.list = new ArrayList<>();
                
            String input = "";
        int valid = -1;
        String case2 = "";
        int validCase2 = -1;
        reading(tollbootobj,receiptobj);
        do {
            input = JOptionPane.showInputDialog("Press 1.To Create Receipts" + "\n" + "Press 2.To Manage The Receipts" + "\n" + "Press 0. To Exit From Program");
            valid = Integer.parseInt(input);
            switch (valid) {
                case 1:
                    receiptobj=new Receipt();
                    String name = JOptionPane.showInputDialog("Enter The Name of Driver(Should Contain Only Alphabets)");
                    String carNumber = JOptionPane.showInputDialog("Enter The Number of Car(Legal format is LEK-14-1324)");
                    String make = JOptionPane.showInputDialog("Enter The Manufactured Year of Car(Legal format 2000 or XXXX)");
                    int makeint = Integer.parseInt(make);
                    String engineCapacity = JOptionPane.showInputDialog("Enter The Engine Capacity of Car(Legal format from (600 to 6599)");
                    int engineCapacityint = Integer.parseInt(engineCapacity);
                    String seatingCapacity = JOptionPane.showInputDialog("Enter The Seating Capacity of Car(Legal format from (4 to 10)");
                    int seatingCapacityint = Integer.parseInt(seatingCapacity);
                    String model = JOptionPane.showInputDialog("Enter The Model of Car(Legal format can contain Numbers,Alphabets and (-)");
                    String isGovtVehicle = JOptionPane.showInputDialog("Enter The(Yes) if Car is Govt and (No) if not(Legal format Yes or Not");
                    if (carobj.validDriverName(name) && carobj.validCarNumber(carNumber) && carobj.validMake(makeint) && carobj.validatengCap(engineCapacityint) && carobj.validatCarseats(seatingCapacityint) && carobj.validCarName(model) ){
                        receiptobj.obj = new Car(model, makeint, carNumber, engineCapacityint, seatingCapacityint, carobj.validGovrCar(isGovtVehicle), name);
                        receiptobj.setTollpaid(receiptobj.obj.calculateToll());
                        Timestamp time=new Timestamp(System.currentTimeMillis());
                        receiptobj.setTimeStamp(time);
                        tollbootobj.list.add(receiptobj);
                        JOptionPane.showMessageDialog(null, "Data Successfully Added");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error in Validation");
                    }
                    break;
                case 2:
                    do {
                        case2 = JOptionPane.showInputDialog("Press 1.To View The List of All Receipts" + "\n" + "Press 2.To Save Receipts" + "\n" + "Press 0.To Go Back");
                        validCase2 = Integer.parseInt(case2);
                        switch (validCase2) {
                            case 1:
                               tollbootobj.outputall();
                                break;
                            case 2:
                                Writing(tollbootobj);
                                break;
                            case 0:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid Input");

                        }
                    } while (validCase2 != 0);
                    break;
                case 0:
                    Writing(tollbootobj);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "You have Enter Invalid Choice");
            }

        } while (valid != 0);
        JOptionPane.showMessageDialog(null, "Program Exited Successfully");     
       
    }
}
