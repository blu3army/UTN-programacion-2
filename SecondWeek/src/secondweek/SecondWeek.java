/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondweek;
import java.util.Scanner;

/**
 *
 * @author nikolai
 */
public class SecondWeek {

    static private Scanner scanner = new Scanner(System.in);
    static final double DISCOUNT = 0.1;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // 1
        leapYear();
        // 2
        greatherThanThree();
        // 3
        ageClassifier();
        // 4
        discountCalculator();
        // 5
        evenNumbers();
        // 6
        positivesNegativesZeros();
        //7
        markValidation();
        
        //8
        System.out.println("Ingrese el precio base del producto: ");
        
        double basePrice = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Ingrese el porcentaje de impuesto");
        
        double tax = Double.parseDouble(scanner.nextLine());       
            
        System.out.println("Ingrese el porcentaje de descuento");
        
        double discount = Double.parseDouble(scanner.nextLine());
                
        calculateFinalPrice(basePrice, tax, discount);
        
        
        // 9
        System.out.println("Ingrese el precio del producto: ");
        double productPrice = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Ingrese el peso del paquete: ");
        double weight = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Ingrese la zona del envío (nacional/internacional): ");
        String zone = scanner.nextLine();
        
        double deliveryCost = calculateDeliveryCost(weight, zone);
        calculateTotalPurchase(productPrice, deliveryCost);
        
        
        // 10
        System.out.println("Ingrese el stock actual: ");
        int currentStock = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Ingrese la cantidad vendida: ");
        int outputStock = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Ingrese la cantidad recibida: ");
        int inputStock = Integer.parseInt(scanner.nextLine());
        
        updateStock(currentStock, outputStock, inputStock);

        // 11
        System.out.println("Ingrese el precio del producto: ");
        double _productPrice = Double.parseDouble(scanner.nextLine());
          
        calculateSpecialDiscount(_productPrice);

        // 12
        modifyingArray();
          
        // 13
        recursiveArray();

    }
    
    static void leapYear(){
        System.out.println("Ingrese un año: ");
        int year = scanner.nextInt();
        
        if( (year % 4) == 0 && ( (year % 100) != 0 || (year % 400) == 0 )){
                                        
            System.out.println("El año " + year + " es bisiesto");            
            
        } else {
            System.out.println("El año " + year + " no es bisiesto");            
        }       
        
    }
    
    static void greatherThanThree(){
       
        int greather = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el "+(i+1)+"° número");          
            int num = scanner.nextInt();
            
            if(num > greather){
                greather = num;
            }
        }
        
        System.out.println("El mayor de los 3 números es el: " + greather);
        
    }

    static void ageClassifier(){
        System.out.println("Ingrese una edad");
        int age = scanner.nextInt();
        
        if(age < 12){
            System.out.println("Eres un niño");
        } else if (age >= 12 && age < 17){
            System.out.println("Eres un adolescente");    
        } else if (age >= 18 && age < 59){
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
        
    }
    
    static void discountCalculator(){
        
        System.out.println("Ingrese precio del producto");
        int price = scanner.nextInt();
        
        System.out.println("Ingrese categoría del producto A, B o C: ");
        
        String cat = "";
        
        while(!cat.equalsIgnoreCase("A") && !cat.equalsIgnoreCase("B") && !cat.equalsIgnoreCase("C")){
            cat = scanner.nextLine();
        }
        
        System.out.println("Precio del producto $" + price);
        
        if(cat.equalsIgnoreCase("A")){            
            System.out.println("Descuento aplicado %10");
            System.out.println("Precio final $" + price * 0.90);
            
        } else if(cat.equalsIgnoreCase("B")){            
            System.out.println("Descuento aplicado %10");
            System.out.println("Precio final $" + price * 0.85);
        } else {
            
            System.out.println("Descuento aplicado %10");
            System.out.println("Precio final $" + price * 0.80);
        }
                
        
    }
    
    static void evenNumbers(){
    
        System.out.println("Ingrese números, para salir ingrese el 0");
         
        int num = -1; 
        int sum = 0;
        while(num != 0){
            
            num = Integer.parseInt(scanner.nextLine());
            
            if(num % 2 == 0){
                sum += num;
            }
                       
        }
        
        System.out.println("La sumatoria de números pares es: " + sum);
        
    }
    
    static void positivesNegativesZeros(){
        
        System.out.println("Ingrese 10 números enteros: ");
        
        int positives = 0, negatives = 0, zeros = 0;
                
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            
            if(n > 0){
                positives += 1;
            } else if( n < 0 ){
                negatives += 1;
            } else {
                zeros += 1;
            }
        }
        
        System.out.println(String.format("Positivos: %d, negativos %d, ceros %d", positives, negatives, zeros));
        
        
    }
    
    static void markValidation(){
        
        boolean err = false;
        int mark = -1;        
        
        do {
            if(!err){
                System.out.println("Ingrese una nota entre 0 y 10");
                err = true;
            } else {
                System.out.println("ERROR! Nota inválida. Ingrese una nota entre 0 y 10");
            }
            
            mark = Integer.parseInt(scanner.nextLine());
                        
        } while (mark < 0 || mark > 10);
        
        System.out.println("Nota guardada correctamente");
        
    }
    
    static void calculateFinalPrice(double basePrice, double tax, double discount){
                
        double finalPrice = basePrice + basePrice * tax/100 - basePrice * discount/100;
        
        System.out.println(String.format("El precio final es $%.2f", finalPrice));
    }
    
    static double calculateDeliveryCost(double weight, String zone){
        
        if(zone.equalsIgnoreCase("internacional")){
        
            return weight * 10;
            
        } 
            
        return weight * 5;      
    
    }
    
    static void calculateTotalPurchase(double productPrice, double deliveryCost){
        System.out.println("Costo de envío $" + deliveryCost);
        System.out.println("Total a pagar $" + (productPrice + deliveryCost));
    }
    
    static void updateStock(int currentStock, int outputQuantity, int inputQuantity){
        int updatedStock = currentStock - outputQuantity + inputQuantity;
        
        System.out.println("La cantidad de stock actualizada es: " + updatedStock);
    }
    
    static void calculateSpecialDiscount(double price){
        double appliedDiscount = DISCOUNT * price;
        
        System.out.println("El descuento aplicado es $" + appliedDiscount);
        System.out.println("El precio final es $" + (price - appliedDiscount));
        
    }
    
    static void modifyingArray(){
        double[] arr = { 100.40, 120.50, 220.20, 350.15, 500.00, 550.20 };
        
        System.out.println("Precios originales");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("$" + arr[i]);            
        }
        
        arr[2] = 1500.00;
        
        System.out.println("Precios modificados");
        
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("$" + arr[i]);            
        }
        
        
    }
    
    private static void recursiveArrayPrinter(int index, double[] arr){
        
        if(index < arr.length){
            System.out.println(arr[index]);
            recursiveArrayPrinter(index + 1, arr);
        }                
    }    
    
    static void recursiveArray(){
        double[] arr = {10.20, 20.20, 30.40, 50.10, 12.40};
        
        recursiveArrayPrinter(0, arr);
        
        arr[2] = 100.20;
        
        recursiveArrayPrinter(0, arr);
    }
    
}
