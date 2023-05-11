package lamdas;

import enums.Division;
import com.Model.HotelManagment.HotelEmployee;
import com.Model.HotelManagment.HouseCleaner;
import com.Model.HotelManagment.Manager;
import com.Model.HotelManagment.Receptionist;

import java.util.function.BiPredicate;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class JavaUtilFunctions {

    public static void main(String[] args) {

        HotelEmployee<HouseCleaner> emp1 = new HotelEmployee<>(101, 1, "Jessica", "Marshal", 30000, 2010, Division.HOUSE_CLEANER);
        HotelEmployee<Manager> emp2 = new HotelEmployee<>(101, 1, "John", "Smith", 60000, 2022, Division.MANAGEMENT);
        HotelEmployee<Receptionist> emp3 = new HotelEmployee<>(103, 1, "Sally", "Johnson", 30000, 2014, Division.RECEPTIONIST);
        HotelEmployee<Receptionist> emp4 = new HotelEmployee<>(103, 1, "Susie", "Johnson", 30000, 2020, Division.RECEPTIONIST);

        HotelEmployee.allHotelEmployees.add(emp2);
        HotelEmployee.allHotelEmployees.add(emp3);
        HotelEmployee.allHotelEmployees.add(emp1);
        HotelEmployee.allHotelEmployees.add(emp4);

        //Predicate Lambda that returns true if the employee was hired before 2015 and false if they were hired during 2015 or later.
        Predicate<HotelEmployee> filterByYearHired = (hotelEmployee) -> hotelEmployee.getYearHired() < 2015;
        System.out.println(filterByYearHired.test(emp1));

        //IntConsumer Lambda. Accepts an int value and does not return anything.
        // This calculates the tax on subtotal and uses the accept() method to pass to subtotal.
        IntConsumer calculateTax = subtotal -> System.out.println((subtotal * .06) + subtotal);
        calculateTax.accept(50);

        //IntFunction<R> lambda. Accepts an in valued argument and produces a result.
        // Uses the apply() method to pass the argument to "a".
        IntFunction<Double> intFunction = a -> a / 2.0;
        System.out.println(intFunction.apply(3));

        //BiPredicate<T, U> lambda. Accepts two arguments. Returns boolean value.
        BiPredicate<Integer, String> biPredicate = (i, s) -> {
            if (i == Integer.parseInt(s)) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(biPredicate.test(2, "2"));

    }
}



