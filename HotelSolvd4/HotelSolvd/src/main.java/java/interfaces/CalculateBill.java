package interfaces;

import java.util.ArrayList;
import java.util.List;

public interface CalculateBill {
    double TAX_RATE = 0.06;

    public double calculateBill(double subtotal);
}
