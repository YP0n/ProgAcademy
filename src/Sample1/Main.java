package Sample1;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            File file = new File("price.txt");
            Integer price = null;
            try {
                Scanner sc = new Scanner(file);
                price = sc.nextInt();
                if (price < 100) {
                    price = null;
                    throw new NegativePriceException();
                }

            } catch (IOException e) {
                System.out.println("File not found");
            } catch (InputMismatchException e) {
                System.out.println("Error file format");
            } catch (NegativePriceException e) {
                System.out.println("Negative price");
            } finally {
                System.out.println("Thank you for using our service :) ");
            }
            System.out.println("price = " + price);
        }

    }

