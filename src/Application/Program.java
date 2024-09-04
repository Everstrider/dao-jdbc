package Application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "forest");
        Seller seller = new Seller(3, "lucas", "lucas8bernadochi@gmail.com", new Date(), 2000.0, obj);
        System.out.println(obj);
        System.out.println(seller);

    }
}