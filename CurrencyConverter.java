
import java.util.Scanner;

// class named variable contains ALL VARIABLES regarding CURRENCY CONVERSION
class variable {

    double Amount, convertedAmount, exchangeRate;
    double INRexchangeRateUSD = 0.0115, INRexchangeRateEURO = 0.011, INRexchangeRatePOUND = 0.00912, INRexchangeRateAED = 0.04225, INRexchangeRateCAD = 1;
    double USDexchangeRateINR = 86.92, USDexchangeRateEURO = 0.96, USDexchangeRatePOUND = 0.79, USDexchangeRateAED = 3.67, USDexchangeRateCAD = 1;
    double EUROexchangeRateUSD = 1.05, EUROexchangeRateINR = 90.84, EUROexchangeRatePOUND = 0.83, EUROexchangeRateAED = 3.84, EUROexchangeRateCAD = 1;
    double POUNDexchangeRateUSD = 1.26, POUNDexchangeRateEURO = 1.21, POUNDexchangeRateINR = 109.63, POUNDexchangeRateAED = 4.63, POUNDexchangeRateCAD = 1;
    double AEDexchangeRateUSD = 0.27, AEDexchangeRateEURO = 0.26, AEDexchangeRatePOUND = 0.22, AEDexchangeRateINR = 23.67, AEDexchangeRateCAD = 1;
    double CADexchangeRateUSD = 1, CADexchangeRateEURO = 1, CADexchangeRatePOUND = 1, CADexchangeRateINR = 1, CADexchangeRateAED = 1;
}

/* class named CurrencyConverter which extends variable class.
   So, all variables of VARIABLE class is used by CurrencyConverter class is possible.
 */
class CurrencyConverter extends variable {

    Scanner sc = new Scanner(System.in);

    //Method for convert currency
    void convert() {
        System.out.print("Enter Amount: ");
        Amount = sc.nextDouble();
        convertedAmount = Amount * exchangeRate;
    }

    //Method to display all currencies that are available
    void displayCurrency() {
        System.out.println("1) Indian Rupee(INR)." + "\n2) US Dollar(USD)." + "\n3) Euro" + "\n4) United Arab Emirates Dirham(AED).");
        System.out.println("5) Pound.\n 6)Canadian Dollar");
    }

    // Method to display entered amount & converted amount after conversion
    void display(String s1, String s2) {
        System.out.println("Entered Amount in " + s1 + " : " + Amount);
        System.out.println("Converted Amount in " + s2 + " : " + convertedAmount + "\n");
    }

    // Method to convert currency from Indian Rupee to remaining ones
    void convertINR() {
        int choice;

        System.out.println("1) Indian Rupee to US Dollar");
        System.out.println("2) Indian Rupee to Euro");
        System.out.println("3) Indian Rupee to AED");
        System.out.println("4) Indian Rupee to Pound\n");
        System.out.println("5) Indian Rupee to CAD\n");
        System.out.print("Enter Your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                exchangeRate = INRexchangeRateUSD;
                convert();
                display("Indian Rupee", "US Dollar");
                break;
            case 2:
                exchangeRate = INRexchangeRateEURO;
                convert();
                display("Indian Rupee", "Euro");
                break;
            case 3:
                exchangeRate = INRexchangeRateAED;
                convert();
                display("Indian Rupee", "AED");
                break;
            case 4:
                exchangeRate = INRexchangeRatePOUND;
                convert();
                display("Indian Rupee", "Pound");
                break;
            case 5:
                exchangeRate = INRexchangeRateCAD;
                convert();
                display("Indian Rupee", "Pound");
                break;
            default:
                System.out.println("Invalid Choice :(");
        }
    }

    void convertCanadianDollar() {
        int choice;

        System.out.println("1) Canadian Dollar to US Dollar");
        System.out.println("2) Canadian Dollar to Euro");
        System.out.println("3) Canadian Dollar to AED");
        System.out.println("4) Canadian Dollar to Pound\n");
        System.out.println("5) Canadian Dollar to INR\n");

        System.out.print("Enter Your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                exchangeRate = CADexchangeRateUSD;
                convert();
                display("Canadian Dollar", "US Dollar");
                break;
            case 2:
                exchangeRate = CADexchangeRateEURO;
                convert();
                display("Canadian Dollar", "Euro");
                break;
            case 3:
                exchangeRate = CADexchangeRateAED;
                convert();
                display("Canadian Dollar", "AED");
                break;
            case 4:
                exchangeRate = CADexchangeRatePOUND;
                convert();
                display("Canadian Dollar", "Pound");
                break;
            case 5:
                exchangeRate = CADexchangeRateINR;
                convert();
                display("Canadian Dollar", "INR");
                break;
            default:
                System.out.println("Invalid Choice :(");
        }
    }

    // Method to convert currency from US Dollar to remaining ones
    void convertUSD() {
        int choice;

        System.out.println("1) US Dollar to Indian Rupee");
        System.out.println("2) US Dollar to Euro");
        System.out.println("3) US Dollar to AED");
        System.out.println("4) US Dollar to Pound");
        System.out.println("4) US Dollar to CAD\n");
        System.out.print("Enter Your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                exchangeRate = USDexchangeRateINR;
                convert();
                display("US Dollar", "Indian Rupee");
                break;
            case 2:
                exchangeRate = USDexchangeRateEURO;
                convert();
                display("US Dollar", "Euro");
                break;
            case 3:
                exchangeRate = USDexchangeRateAED;
                convert();
                display("US Dollar", "AED");
                break;
            case 4:
                exchangeRate = USDexchangeRatePOUND;
                convert();
                display("US Dollar", "Pound");
                break;
            case 5:
                exchangeRate = USDexchangeRateCAD;
                convert();
                display("US Dollar", "CAD");
                break;
            default:
                System.out.println("Invalid Choice :(");
        }
    }

    // Method to convert currency from EURO to remaining ones
    void convertEuro() {
        int choice;

        System.out.println("1) Euro to US Dollar");
        System.out.println("2) Euro to Indian Rupee");
        System.out.println("3) Euro to AED");
        System.out.println("4) Euro to Pound");
        System.out.println("5) Euro to CAD");
        System.out.print("Enter Your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                exchangeRate = EUROexchangeRateUSD;
                convert();
                display("Euro", "US Dollar");
                break;
            case 2:
                exchangeRate = EUROexchangeRateINR;
                convert();
                display("Euro", "Indian Rupee");
                break;
            case 3:
                exchangeRate = EUROexchangeRateAED;
                convert();
                display("Euro", "AED");
                break;
            case 4:
                exchangeRate = EUROexchangeRatePOUND;
                convert();
                display("Euro", "Pound");
                break;
            case 5:
                exchangeRate = EUROexchangeRateCAD;
                convert();
                display("Euro", "CAD");
                break;
            default:
                System.out.println("Invalid Choice :(");
        }
    }

    // Method to convert currency from Dirham(AED) to remaining ones
    void convertAED() {
        int choice;

        System.out.println("1) AED to US Dollar");
        System.out.println("2) AED to Euro");
        System.out.println("3) AED to Indian Rupee");
        System.out.println("4) AED to Pound");
        System.out.println("5) AED to CAD");
        System.out.print("Enter Your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                exchangeRate = AEDexchangeRateUSD;
                convert();
                display("AED", "US Dollar");
                break;
            case 2:
                exchangeRate = AEDexchangeRateEURO;
                convert();
                display("AED", "Euro");
                break;
            case 3:
                exchangeRate = AEDexchangeRateINR;
                convert();
                display("AED", "Indian Rupee");
                break;
            case 4:
                exchangeRate = AEDexchangeRatePOUND;
                convert();
                display("AED", "Pound");
                break;
            case 5:
                exchangeRate = AEDexchangeRateCAD;
                convert();
                display("AED", "CAD");
                break;
            default:
                System.out.println("Invalid Choice :(");
        }
    }

    // Method to convert currency from POUND to remaining ones
    void convertPound() {
        int choice;

        System.out.println("1) Pound to US Dollar");
        System.out.println("2) Pound to Euro");
        System.out.println("3) Pound to AED");
        System.out.println("4) Pound to Indian Rupee");
        System.out.println("5) Pound to Indian Rupee\n");
        System.out.print("Enter Your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                exchangeRate = POUNDexchangeRateUSD;
                convert();
                display("Pound", "US Dollar");
                break;
            case 2:
                exchangeRate = POUNDexchangeRateEURO;
                convert();
                display("Pound", "Euro");
                break;
            case 3:
                exchangeRate = POUNDexchangeRateAED;
                convert();
                display("Pound", "AED");
                break;
            case 4:
                exchangeRate = POUNDexchangeRateINR;
                convert();
                display("Pound", "Indian Rupee");
                break;
            case 5:
                exchangeRate = POUNDexchangeRateCAD;
                convert();
                display("Pound", "CAD");
                break;
            default:
                System.out.println("Invalid Choice :(");
        }
    }

    int choice4;

    // Method to update exchange rate between Indian Rupee & other currency
    void updateExchangeRateINR() {
        System.out.println("Update Currency of Indian Rupee with: ");
        System.out.println("1) US Dollar(USD)." + "\n2) Euro" + "\n3) United Arab Emirates Dirham(AED).\n4) Pound.\n5)CAD.");
        System.out.print("Enter Your Choice: ");
        choice4 = sc.nextInt();

        switch (choice4) {
            case 1:
                System.out.print("Enter Exchange Rate: ");
                INRexchangeRateUSD = sc.nextDouble();
                USDexchangeRateINR = 1 / INRexchangeRateUSD;
                break;
            case 2:
                System.out.print("Enter Exchange Rate: ");
                INRexchangeRateEURO = sc.nextDouble();
                EUROexchangeRateINR = 1 / INRexchangeRateEURO;
                break;
            case 3:
                System.out.print("Enter Exchange Rate: ");
                INRexchangeRateAED = sc.nextDouble();
                AEDexchangeRateINR = 1 / INRexchangeRateAED;
                break;
            case 4:
                System.out.print("Enter Exchange Rate: ");
                INRexchangeRatePOUND = sc.nextDouble();
                POUNDexchangeRateINR = 1 / INRexchangeRatePOUND;
                break;
            case 5:
                System.out.print("Enter Exchange Rate: ");
                INRexchangeRateCAD = sc.nextDouble();
                CADexchangeRateINR = 1 / INRexchangeRateCAD;
                break;
            default:
                System.out.println("Invalid choice :(");
        }
    }

    // Method to update exchange rate between US Dollar & other currency
    void updateExchangeRateUSD() {
        System.out.println("Update Currency of US Dollar with: ");
        System.out.println("1) Indian Rupee(INR)." + "\n2) Euro" + "\n3) United Arab Emirates Dirham(AED).\n4) Pound.\n5)CAD");
        System.out.print("Enter Your Choice: ");
        choice4 = sc.nextInt();

        switch (choice4) {
            case 1:
                System.out.print("Enter Exchange Rate: ");
                USDexchangeRateINR = sc.nextDouble();
                INRexchangeRateUSD = 1 / USDexchangeRateINR;
                break;
            case 2:
                System.out.print("Enter Exchange Rate: ");
                USDexchangeRateEURO = sc.nextDouble();
                EUROexchangeRateUSD = 1 / USDexchangeRateEURO;
                break;
            case 3:
                System.out.print("Enter Exchange Rate: ");
                USDexchangeRateAED = sc.nextDouble();
                AEDexchangeRateUSD = 1 / USDexchangeRateAED;
                break;
            case 4:
                System.out.print("Enter Exchange Rate: ");
                USDexchangeRatePOUND = sc.nextDouble();
                POUNDexchangeRateUSD = 1 / USDexchangeRatePOUND;
                break;
            case 5:
                System.out.print("Enter Exchange Rate: ");
                USDexchangeRateCAD = sc.nextDouble();
                CADexchangeRateUSD = 1 / USDexchangeRateCAD;
                break;
            default:
                System.out.println("Invalid choice :(");
        }
    }

    // Method to update exchange rate between EURO & other currency
    void updateExchangeRateEURO() {
        System.out.println("Update Currency of EURO with: ");
        System.out.println("1) US Dollar(USD)." + "\n2) Indian Rupee(INR)" + "\n3) United Arab Emirates Dirham(AED).\n4) Pound.\n5)CAD");
        System.out.print("Enter Your Choice: ");
        choice4 = sc.nextInt();

        switch (choice4) {
            case 1:
                System.out.print("Enter Exchange Rate: ");
                EUROexchangeRateUSD = sc.nextDouble();
                USDexchangeRateEURO = 1 / EUROexchangeRateUSD;
                break;
            case 2:
                System.out.print("Enter Exchange Rate: ");
                EUROexchangeRateINR = sc.nextDouble();
                INRexchangeRateEURO = 1 / EUROexchangeRateINR;
                break;
            case 3:
                System.out.print("Enter Exchange Rate: ");
                EUROexchangeRateAED = sc.nextDouble();
                AEDexchangeRateEURO = 1 / EUROexchangeRateAED;
                break;
            case 4:
                System.out.print("Enter Exchange Rate: ");
                EUROexchangeRatePOUND = sc.nextDouble();
                POUNDexchangeRateEURO = 1 / EUROexchangeRatePOUND;
                break;
            case 5:
                System.out.print("Enter Exchange Rate: ");
                EUROexchangeRateCAD = sc.nextDouble();
                CADexchangeRateEURO = 1 / EUROexchangeRateCAD;
                break;
            default:
                System.out.println("Invalid choice :(");
        }
    }

    // Method to update exchange rate between Dirham(AED) & other currency
    void updateExchangeRateAED() {
        System.out.println("Update Currency of AED with: ");
        System.out.println("1) US Dollar(USD)." + "\n2) Euro" + "\n3) Indian Rupee(INR).\n4) Pound.\n5)CAD");
        System.out.print("Enter Your Choice: ");
        choice4 = sc.nextInt();

        switch (choice4) {
            case 1:
                System.out.print("Enter Exchange Rate: ");
                AEDexchangeRateUSD = sc.nextDouble();
                USDexchangeRateAED = 1 / AEDexchangeRateUSD;
                break;
            case 2:
                System.out.print("Enter Exchange Rate: ");
                AEDexchangeRateEURO = sc.nextDouble();
                EUROexchangeRateAED = 1 / AEDexchangeRateEURO;
                break;
            case 3:
                System.out.print("Enter Exchange Rate: ");
                AEDexchangeRateINR = sc.nextDouble();
                INRexchangeRateAED = 1 / AEDexchangeRateINR;
                break;
            case 4:
                System.out.print("Enter Exchange Rate: ");
                AEDexchangeRatePOUND = sc.nextDouble();
                POUNDexchangeRateAED = 1 / AEDexchangeRatePOUND;
                break;
            case 5:
                System.out.print("Enter Exchange Rate: ");
                AEDexchangeRateCAD = sc.nextDouble();
                CADexchangeRateAED = 1 / AEDexchangeRateCAD;
                break;
            default:
                System.out.println("Invalid choice :(");
        }
    }

    // Method to update exchange rate between POUND & other currency
    void updateExchangeRatePOUND() {
        System.out.println("Update Currency of POUND with: ");
        System.out.println("1) US Dollar(USD)." + "\n2) Euro" + "\n3) United Arab Emirates Dirham(AED).\n4) Indian Rupee(INR).\n5)CAD");
        System.out.print("Enter Your Choice: ");
        choice4 = sc.nextInt();

        switch (choice4) {
            case 1:
                System.out.print("Enter Exchange Rate: ");
                POUNDexchangeRateUSD = sc.nextDouble();
                USDexchangeRatePOUND = 1 / POUNDexchangeRateUSD;
                break;
            case 2:
                System.out.print("Enter Exchange Rate: ");
                POUNDexchangeRateEURO = sc.nextDouble();
                EUROexchangeRatePOUND = 1 / POUNDexchangeRateEURO;
                break;
            case 3:
                System.out.print("Enter Exchange Rate: ");
                POUNDexchangeRateAED = sc.nextDouble();
                AEDexchangeRatePOUND = 1 / POUNDexchangeRateAED;
                break;
            case 4:
                System.out.print("Enter Exchange Rate: ");
                POUNDexchangeRateINR = sc.nextDouble();
                INRexchangeRatePOUND = 1 / POUNDexchangeRateINR;
                break;
            case 5:
                System.out.print("Enter Exchange Rate: ");
                POUNDexchangeRateCAD = sc.nextDouble();
                CADexchangeRatePOUND = 1 / POUNDexchangeRateCAD;
                break;
            default:
                System.out.println("Invalid choice :(");
        }
    }

    void updateExchangeRateCAD() {
        System.out.println("Update Currency of CAD with: ");
        System.out.println("1) US Dollar(USD)." + "\n2) Euro" + "\n3) United Arab Emirates Dirham(AED).\n4) Indian Rupee(INR).\n5)POUND");
        System.out.print("Enter Your Choice: ");
        choice4 = sc.nextInt();

        switch (choice4) {
            case 1:
                System.out.print("Enter Exchange Rate: ");
                CADexchangeRateUSD = sc.nextDouble();
                USDexchangeRateCAD = 1 / CADexchangeRateUSD;
                break;
            case 2:
                System.out.print("Enter Exchange Rate: ");
                CADexchangeRateEURO = sc.nextDouble();
                EUROexchangeRateCAD = 1 / CADexchangeRateEURO;
                break;
            case 3:
                System.out.print("Enter Exchange Rate: ");
                CADexchangeRateAED = sc.nextDouble();
                AEDexchangeRateCAD = 1 / CADexchangeRateAED;
                break;
            case 4:
                System.out.print("Enter Exchange Rate: ");
                CADexchangeRateINR = sc.nextDouble();
                INRexchangeRateCAD = 1 / CADexchangeRateINR;
                break;
            case 5:
                System.out.print("Enter Exchange Rate: ");
                CADexchangeRatePOUND = sc.nextDouble();
                POUNDexchangeRateCAD = 1 / CADexchangeRatePOUND;
                break;
            default:
                System.out.println("Invalid choice :(");
        }
    }
}

class RUN_CURRENCY {

    //psvm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter obj = new CurrencyConverter();
        int choice1, choice2, choice3;

        do {
            System.out.println("********** MAIN MENU **********");
            System.out.println("1) Display Available Currency.");
            System.out.println("2) Currency Conversion.");
            System.out.println("3) Update Exchange Rate.");
            System.out.println("4) Exit.\n");
            System.out.print("Enter your choice: ");
            choice1 = sc.nextInt();

            switch (choice1) {
                case 1:
                    obj.displayCurrency();
                    break;
                case 2:
                    System.out.println("Conversion between: ");
                    System.out.println("1) Indian Rupee");
                    System.out.println("2) Euro");
                    System.out.println("3) AED(Dirham)");
                    System.out.println("4) Pound");
                    System.out.println("5) US Dollar");
                    System.out.println("6)CAD");
                    System.out.print("Enter your choice from above menu: ");
                    choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            obj.convertINR();
                            break;
                        case 2:
                            obj.convertEuro();
                            break;
                        case 3:
                            obj.convertAED();
                            break;
                        case 4:
                            obj.convertPound();
                            break;
                        case 5:
                            obj.convertUSD();
                            break;
                        case 6:
                            obj.convertCanadianDollar();
                            break;
                        default:
                            System.out.println("Invalid Choice :(");
                    }
                    break;
                case 3:
                    System.out.println("Update Exchange Rate of: ");
                    System.out.println("1) Indian Rupee(INR)." + "\n2) US Dollar(USD)." + "\n3) Euro" + "\n4) United Arab Emirates Dirham(AED).");
                    System.out.println("5) Pound.\n6)CAD");
                    System.out.println("Enter Your choice: ");
                    choice3 = sc.nextInt();

                    switch (choice3) {
                        case 1:
                            obj.updateExchangeRateINR();
                            break;
                        case 2:
                            obj.updateExchangeRateUSD();
                            break;
                        case 3:
                            obj.updateExchangeRateEURO();
                            break;
                        case 4:
                            obj.updateExchangeRateAED();
                            break;
                        case 5:
                            obj.updateExchangeRatePOUND();
                            break;
                        case 6:
                            obj.updateExchangeRateCAD();
                            break;
                        default:
                            System.out.println("Invalid Choice :(");
                    }
                    break;
                case 4:
                    System.out.println("Thank You :)");
                    break;
                default:
                    System.out.println("Invalid choice:(");
            }
        } while (choice1 != 4);
    }
}
