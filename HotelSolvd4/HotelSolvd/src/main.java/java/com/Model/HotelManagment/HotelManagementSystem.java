package com.Model.HotelManagment;

import java.io.*;

import enums.HotelGreeting;
import enums.MenuItems;
import enums.PaymentGreeting;
import enums.TrafficLight;
import exceptions.*;
import org.apache.log4j.Logger;

import static enums.TrafficLight.*;

public abstract class HotelManagementSystem {
    private static final Logger logger = Logger.getLogger(HotelManagementSystem.class);
    public static final String FILE_NAME = "target/log.log";

    //public ArrayList<File> file = new ArrayList<File>((Collection<? extends File>) fileName);


    public static void main(String[] args) throws CheckDuplicateEmployeeIdException, CheckCorrectYearFormatException,
            CheckHotelExistsException,CheckCorrectNameFormatException, IOException {
        //Logs to "log4j.properties file.
        //logger.info("Hello world.");
        //logger.info("What a beautiful day.");

        //Setting enums.
        PracticeEnums p1 = new PracticeEnums(1, "This light is green", TrafficLight.GREEN.getLightColorMeaning());
        System.out.println(p1);

        Order order = new Order(1, 1, MenuItems.PASTA.getFoodType(), 16.99, 1, 1, 1 );
        System.out.println(order);

        Hotel hotel = new Hotel(1, HotelGreeting.HILTON.getGreeting(), 100);
        System.out.println(hotel);



        // public static final String INPUT_FILE = "src/main/resources/repeating_words.txt";
        //File file = new File("src/main/resources/repeating_words.txt");
         /*  File fileName = new File("repeating_words.txt");
        Scanner scanFile = new Scanner(fileName);
        while( scanFile.hasNextLine()) {
            String readingTheFile = scanFile.nextLine();
            List<String> readingTheFileToList = new ArrayList<>(Collections.singleton(readingTheFile));
               for(int i = 0; i < readingTheFile.length(); i++) {
                   if (readingTheFileToList.contains(i)) {
                       readingTheFileToList.remove(i);
                       Print.print(readingTheFileToList);
                   }
               }
        }*/

        //Throws custom CheckCorrectNameFormatException
        /*try {
            HotelEmployee<HouseCleaner> emp1 = new HotelEmployee<>(101, 1, "Jessica", "Marshal", 30000, 2010, Division.HOUSE_CLEANER);
            HotelEmployee.allHotelEmployees.add(emp1);
            emp1.setHotelEmployeeFirstName("Jes ica");
        } catch (CheckCorrectNameFormatException e) {
            e.printStackTrace();
        }*/

        //Throws custom CheckCorrectYearException
       /* try {
            HotelEmployee<HouseCleaner> emp1 = new HotelEmployee<>(101, 1, "Jessica", "Marshal", 30000, 2010, Division.HOUSE_CLEANER);
            HotelEmployee.allHotelEmployees.add(emp1);
            emp1.setYearHired(11111);
        } catch (CheckCorrectYearFormatException e) {
            e.printStackTrace();
        }*/

        //Throws custom DuplicateIdException
        /*try {

            HotelEmployee<HouseCleaner> emp1 = new HotelEmployee<>(101, 1, "Jessica", "Marshal", 30000, 2010, Division.HOUSE_CLEANER);
            HotelEmployee<Manager> emp2 = new HotelEmployee<>(101, 1, "John", "Smith", 60000, 2022, Division.MANAGEMENT);
            HotelEmployee<Receptionist> emp3 = new HotelEmployee<>(103, 1, "Sally", "Johnson", 30000, 2020, Division.RECEPTIONIST);
            HotelEmployee.allHotelEmployees.add(emp2);
            HotelEmployee.allHotelEmployees.add(emp3);
            HotelEmployee.allHotelEmployees.add(emp1);
            emp1.setHotelEmployeeId(101);
        } catch (DuplicateIdException e) {
            e.printStackTrace();
        }*/

        //Throws CheckHotelExistsException
        /*try {
         Hotel hotel1 = new Hotel(1, "Hilton", 0);
         Hotel hotel2 = new Hotel(0, "Super8", 0);
         Hotel hotel3 = new Hotel(3, "Hilton", 0);
         Hotel.allHotels.add(hotel1);
         Hotel.allHotels.add(hotel2);
         Hotel.allHotels.add(hotel3);
         hotel3.setHotelName("Hilton");

     }catch (CheckHotelExistsException e) {
         e.printStackTrace();
     }*/

        //Throws CheckHotelIdException
        /*try {
            Hotel hotel4 = new Hotel(1, "Super8", 0);
            hotel4.setHotelId(0);
        } catch (CheckHotelIdException e) {
            e.printStackTrace();
        }*/




        /*File fileName = new File("repeating_words.txt");
        ArrayList<Scanner> scanFile = new ArrayList<Scanner>((Collection<? extends Scanner>) fileName);
        while(int i = 0; i < scanFile; i++) {
            String readingTheFile = scanFile.nextLine();
            for(String f : readingTheFile);

            if(!readingTheFile.contains())
        }*/


        // Print.print(Hotel.allHotels);


//Working with the tables LinkedList.
        /*Table table1 = new Table(1, 1, 1);
        Table table2 = new Table(2, 2, 2);
        Table table3 = new Table(3, 3, 3);
        Table.tables.add(table1);
        Table.tables.add(table2);
        Table.tables.add(table3);
        System.out.println(Table.tables);
        Table.tables.remove(1);
        System.out.println(Table.tables);*/


//Working with Menu HashMap. Assigning price to a menu item.
        Menu.menuItemsWithPrice.put("Burger", 6.99);
        Menu.menuItemsWithPrice.put("PizzaSlice", 4.50);
        // System.out.println(Menu.menuItemsWithPrice);

        Bill b = new Bill(1, 1, 25.99);
        //System.out.println(b.calculateBill(b.getTotalBill()));

        /*logger.info("Hello world.");
        logger.info("What a beautiful day.");*/

        /*Create hotel employees of Types HouseCleaner, Manager, and Receptionist.
         * Add them all to List allHotelEmployees.
         */
        /*try {
            HotelEmployee<HouseCleaner> emp1 = new HotelEmployee<>(101, 1, "Jessica", "Marshal", 30000, 2010, Division.HOUSE_CLEANER);
            HotelEmployee<Manager> emp2 = new HotelEmployee<>(101, 1, "John", "Smith", 60000, 2022, Division.MANAGEMENT);
            HotelEmployee<Receptionist> emp3 = new HotelEmployee<>(103, 1, "Sally", "Johnson", 30000, 2020, Division.RECEPTIONIST);
            HotelEmployee.allHotelEmployees.add(emp2);
            HotelEmployee.allHotelEmployees.add(emp3);
            HotelEmployee.allHotelEmployees.add(emp1);
            emp1.setHotelEmployeeId(101);
        }*/


        // Calls the print method from the Print interface.
        //Print.print(HotelEmployee.allHotelEmployees);

        //Adds the 2 types of RestaurantEmployee (Chef and Server) to the list restaurantEmployees.
        RestaurantEmployee<Chef> restaurantEmployee1 = new RestaurantEmployee<>(1, "David", "Smith", 60000, 2000);
        RestaurantEmployee<Server> restaurantEmployee2 = new RestaurantEmployee<>(2, "Roger", "Brown", 30000, 2020);
        RestaurantEmployee.allRestaurantEmployees.add(restaurantEmployee1);
        RestaurantEmployee.allRestaurantEmployees.add(restaurantEmployee2);
        //Print.print(RestaurantEmployee.allRestaurantEmployees);

        CustomLinkedList<Table> listOfTables = new CustomLinkedList<>();
        listOfTables.insertFirst(new Table(1, 1, 1));
        listOfTables.insertLast(new Table(2, 2, 2));
        //System.out.println(listOfTables.toString());

        Bill bill = new Bill(1, 1, 35.99);
        //Get salary increase for emp1.
        //System.out.println(emp1.getSalaryIncrease(emp1.getSalary()));

        //Calculate the bill with tax.
        //System.out.println(bill.calculateBill(bill.getTotalBill()));


        //HouseCleaner emp1 = new HouseCleaner(101, 1, "Jessica", "Marshal", 30000, 2010, Division.HOUSE_CLEANER);
        //HotelEmployee.allHotelEmployees.add(emp1);
        //Hotel.addEmployee();
        //Manager emp2 = new Manager(102, 1, "John", "Smith", 60000, 2022, Division.MANAGEMENT);
        //HotelEmployee.allHotelEmployees.add(emp2);
        // System.out.println(HotelEmployee.allHotelEmployees);


    }
}


