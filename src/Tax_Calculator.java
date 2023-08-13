import java.util.*;
class Tax_Calculator{
    public static void main(String args[]){
        HomePage();
    }

    public static void HomePage(){
        System.out.println("                 __   _____   _______ ________ ");
        System.out.println("                |  \\ /      \\|       |        \\");
        System.out.println("                  \\$| $$$$$$| $$$$$$$$\\$$$$$$$$ " );
        System.out.println("                | $$| $$  \\$| $$__      | $$ " );
        System.out.println("                | $$| $$    | $$  \\     | $$" );
        System.out.println("                | $$| $$  __| $$$$$     | $$" );
        System.out.println("                | $$| $$_/  | $$_____   | $$" );
        System.out.println("                | $$| $$   $| $$     \\  | $$");
        System.out.println("                 \\$$ \\$$$$$$ \\$$$$$$$$   \\$$   ");
        System.out.println("");
        System.out.println("");

        System.out.println(" ________            _    _       _____              _          _____");
        System.out.println("|__    __|   /\\     \\ \\  / /     / ____|     /\\     | |        / ____|");
        System.out.println("   |  |     /  \\     \\ \\/ /     | |         /  \\    | |       | |");
        System.out.println("   |  |    / /\\ \\     > <       | |        / /\\ \\   | |       | |");
        System.out.println("   |  |   / ____ \\   / . \\      | |____   / ___  \\  | |______ | |____");
        System.out.println("   |__|  /_/    \\_\\ /_/ \\_\\      \\_____| /_/    \\_\\ |________| \\_____|    ");

        System.out.println("========================================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("    [01] Withholding Tax \n");
        System.out.println("    [02] Payable Tax \n");
        System.out.println("    [03] Income Tax \n");
        System.out.println("    [04] Social Security Contribution Levy (SSCL) Tax \n");
        System.out.println("    [05] Leasing Payment \n");
        System.out.println("    [06] Exit \n");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter an Option to continue  -> ");
        int Option=input.nextInt();
        System.out.println("");

        while(Option!=1 && Option!=2 && Option!=3 && Option!=4 && Option!=5 && Option!=6) {
            System.out.println("    Invalid Option...... ");
            System.out.println("");
            System.out.print("Enter an Valid Option to continue  -> ");
            Option=input.nextInt();
        }
        switch(Option){
            case	1: Withholding_Tax(Option);break;
            case	2: Payable_Tax(Option);break;
            case	3: Income_Tax(Option); break;
            case 	4: SSCL_Tax(Option); break;
            case 	5: Leasing_Payment(Option); break;
            default  : clearConsole(); System.out.println("\n Thank You \n");

        }
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

    public static void Withholding_Tax(int Option){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                  WITHHOLDING TAX                  |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");
        System.out.println("     [01] Rent Tax \n");
        System.out.println("     [02] Bank Interest Tax \n");
        System.out.println("     [03] Dividend Tax \n");
        System.out.println("     [04] Exit \n");
        System.out.print("Enter an Option to continue  -> ");
        int num=input.nextInt();

        while(num!=1 && num!=2 && num!=3 && num!=4 ) {
            System.out.println("    Invalid Option...... ");
            System.out.println("");
            System.out.print("Enter an Valid Option to continue  -> ");
            num=input.nextInt();
        }

        switch(num){
            case	1: WT_Rent_tax();break;
            case	2: WT_Bank_Interest_tax();break;
            case	3: WT_Devidend_tax(); break;
            case 	4: HomePage(); break;
        }
    }
    public static void WT_Rent_tax(){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                     RENT TAX                      |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");

        System.out.print("Enter your rent          : ");
        int num=input.nextInt();

        while(num<0 ) {
            System.out.println("    Invalid Option...... ");
            System.out.println("");
            System.out.print("Do you want to enter the correct value again (Y/N): ");
            char ch=input.next().charAt(0);
            while(ch!='Y' && ch!='N'){
                System.out.print("Please enter Y or N only : ");
                ch=input.next().charAt(0);
            }
            if(ch=='Y'){
                WT_Rent_tax();
            }
            else{
                clearConsole();
                HomePage();
            }
        }
        if(num>100000){
            double t=(num-100000);
            t=(t*0.1);
            t=(double)Math.round(t * 100) / 100;
            System.out.println("");
            System.out.println("You have to pay Rent Tax : "+ t+"0\n");
        }
        else{
            System.out.println("You don't have to pay Rent Tax....");
        }
        System.out.println("\n");
        System.out.print("Do you want to calculate another Rent Tax (Y/N): ");
        char ch=input.next().charAt(0);
        while(ch!='Y' && ch!='N'){
            System.out.print("Please enter Y or N only : ");
            ch=input.next().charAt(0);
        }
        if(ch=='Y'){
            WT_Rent_tax();
        }
        else{
            clearConsole();
            HomePage();
        }
    }
    public static void WT_Bank_Interest_tax(){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                 BANK INTEREST TAX                 |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");

        System.out.print("Enter your bank interest per year          : ");
        int num=input.nextInt();

        while(num<0 ) {
            System.out.println("    Invalid Option...... ");
            System.out.println("");
            System.out.print("Do you want to enter the correct value again (Y/N): ");
            char ch=input.next().charAt(0);
            while(ch!='Y' && ch!='N'){
                System.out.print("Please enter Y or N only : ");
                ch=input.next().charAt(0);
            }
            if(ch=='Y'){
                WT_Bank_Interest_tax();
            }
            else{
                clearConsole();
                HomePage();
            }
        }
        double t=(num*0.05);
        t=(double)Math.round(t * 100) / 100;
        System.out.println("");
        System.out.println("You have to pay Bank Interest Tax per yrar : "+ t+"0\n");

        System.out.println("\n");
        System.out.print("Do you want to calculate another Bank Interest Tax (Y/N): ");
        char ch=input.next().charAt(0);
        while(ch!='Y' && ch!='N'){
            System.out.print("Please enter Y or N only : ");
            ch=input.next().charAt(0);
        }
        if(ch=='Y'){
            WT_Bank_Interest_tax();
        }
        else{
            clearConsole();
            HomePage();
        }
    }
    public static void WT_Devidend_tax(){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                    DIVIDEND TAX                   |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");

        System.out.print("Enter your total dividend per year          : ");
        int num=input.nextInt();

        while(num<0 ) {
            System.out.println("    Invalid Option...... ");
            System.out.println("");
            System.out.print("Do you want to enter the correct value again (Y/N): ");
            char ch=input.next().charAt(0);
            while(ch!='Y' && ch!='N'){
                System.out.print("Please enter Y or N only : ");
                ch=input.next().charAt(0);
            }
            if(ch=='Y'){
                WT_Devidend_tax();
            }
            else{
                clearConsole();
                HomePage();
            }
        }
        if(num>100000){
            double t=(num-100000);
            t=(t*0.14);
            t=(double)Math.round(t * 100) / 100;
            System.out.println("");
            System.out.println("You have to pay Dividend Tax per year       : "+ t+"0\n");
        }
        else{
            System.out.println("     You don't have to pay Dividend Tax....");
        }
        System.out.println("\n");
        System.out.print("Do you want to calculate another Dividend Tax (Y/N): ");
        char ch=input.next().charAt(0);
        while(ch!='Y' && ch!='N'){
            System.out.print("Please enter Y or N only : ");
            ch=input.next().charAt(0);
        }
        if(ch=='Y'){
            WT_Devidend_tax();
        }
        else{
            clearConsole();
            HomePage();
        }
    }

    public static void Payable_Tax(int Option){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                     PAYABLE TAX                   |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");
        System.out.print("Enter your employee payment per month : ");
        int num=input.nextInt();

        while(num<0 ) {
            System.out.println("    Invalid Option...... ");
            System.out.println("");
            System.out.print("Do you want to enter the correct value again (Y/N): ");
            char ch=input.next().charAt(0);
            while(ch!='Y' && ch!='N'){
                System.out.print("Please enter Y or N only : ");
                ch=input.next().charAt(0);
            }
            if(ch=='Y'){
                Payable_Tax(Option);
            }
            else{
                clearConsole();
                HomePage();
            }
        }
        int x;
        double total =0;
        if(num<100000){
            System.out.println("");
            System.out.println("      You don't have to pay Payable Tax….");
            System.out.println("");
        }
        if(num>100000){
            x = (num > 141667) ? 41667 : (num - 100000);
            total=total+x*0.06;
        }
        if(num>141667){
            x = (num>183333) ? 41667 : (num - 141667);
            total=total+x*0.12;
        }
        if(num>183333){
            x = (num>225000) ? 41667 : (num - 183333);
            total=total+x*0.18;
        }
        if(num>225000){
            x = (num>266667) ? 41667 : (num - 225000);
            total=total+x*0.24;
        }
        if(num>266667){
            x = (num>308333) ? 41667 : (num - 266667);
            total=total+x*0.3;
        }
        if(num>308333){
            x=num-308333;
            total=total+x*0.36;
        }
        if(num>100000){
            System.out.println("");
            System.out.println("You have to pay Payable Tax per month : "+(double)Math.round(total * 100) / 100);
            System.out.println("\n");
        }
        System.out.print("Do you want to calculate another Payable Tax (Y/N): ");
        char ch=input.next().charAt(0);
        while(ch!='Y' && ch!='N'){
            System.out.print("Please enter Y or N only : ");
            ch=input.next().charAt(0);
        }
        if(ch=='Y'){
            Payable_Tax(Option);
        }
        else{
            clearConsole();
            HomePage();
        }
    }

    public static void Income_Tax(int Option){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                     Income TAX                    |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");
        System.out.print("Enter your employee income per Year : ");
        int num=input.nextInt();

        while(num<0 ) {
            System.out.println("    Invalid Option...... ");
            System.out.println("");
            System.out.print("Do you want to enter the correct value again (Y/N): ");
            char ch=input.next().charAt(0);
            while(ch!='Y' && ch!='N'){
                System.out.print("Please enter Y or N only : ");
                ch=input.next().charAt(0);
            }
            if(ch=='Y'){
                Income_Tax(Option);
            }
            else{
                clearConsole();
                HomePage();
            }
        }
        int x;
        double total =0;
        if(num<1200000){
            System.out.println("");
            System.out.println("      You don't have to pay Income Tax….\n");

        }
        if(num>1200000){
            x = (num > 1700000) ? 500000 : (num - 1200000);
            total=total+x*0.06;
        }
        if(num>1700000){
            x = (num>2200000) ? 500000 : (num - 1700000);
            total=total+x*0.12;
        }
        if(num>2200000){
            x = (num>2700000) ? 500000 : (num - 2200000);
            total=total+x*0.18;
        }
        if(num>2700000){
            x = (num>3200000) ? 500000 : (num - 2700000);
            total=total+x*0.24;
        }
        if(num>3200000){
            x = (num>3700000) ? 500000 : (num - 2200000);
            total=total+x*0.3;
        }
        if(num>3700000){
            x=num-3700000;
            total=total+x*0.36;
        }
        if(num>1200000){
            System.out.println("");
            System.out.println("You have to pay Income Tax per year : "+(double)Math.round(total * 100) / 100);
            System.out.println("\n");

        }
        System.out.println("");
        System.out.print("Do you want to calculate another Income Tax (Y/N): ");
        char ch=input.next().charAt(0);
        while(ch!='Y' && ch!='N'){
            System.out.print("Please enter Y or N only : ");
            ch=input.next().charAt(0);
        }
        if(ch=='Y'){
            Income_Tax(Option);
        }
        else{
            clearConsole();
            HomePage();
        }
    }

    public static void SSCL_Tax(int Option){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|    SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX   |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");
        System.out.print("Enter value of Good or Service : ");
        double num=input.nextDouble();

        while(num<0 ) {
            System.out.println("    Invalid Option...... ");
            System.out.println("");
            System.out.print("Do you want to enter the correct value again (Y/N): ");
            char ch=input.next().charAt(0);
            while(ch!='Y' && ch!='N'){
                System.out.print("Please enter Y or N only : ");
                ch=input.next().charAt(0);
            }
            if(ch=='Y'){
                SSCL_Tax(Option);
            }
            else{
                clearConsole();
                HomePage();
            }
        }
        double total =0;
        total=num*0.025;
        num=num+total;
        double sscl = num*0.15 + total;
        System.out.println("");
        System.out.println("You have to pay SSCL Tax : "+ sscl+"0\n");
        System.out.println("");
        System.out.print("Do you want to calculate another SSCL Tax (Y/N): ");
        char ch=input.next().charAt(0);
        while(ch!='Y' && ch!='N'){
            System.out.print("Please enter Y or N only : ");
            ch=input.next().charAt(0);
        }
        if(ch=='Y'){
            Income_Tax(Option);
        }
        else{
            clearConsole();
            HomePage();
        }
    }

    public static void Leasing_Payment(int Option){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                  LEASING PAYMENT                  |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");
        System.out.println("     [01] Calculate Monthly Installment \n");
        System.out.println("     [02] Search Leasing Category \n");
        System.out.println("     [03] Find the Leasing Amount \n");
        System.out.println("     [04] Exit \n");
        System.out.print("Enter an Option to continue  -> ");
        int num=input.nextInt();

        while(num!=1 && num!=2 && num!=3 && num!=4 ) {
            System.out.println("    Invalid Option...... ");
            System.out.println("");
            System.out.print("Enter an Valid Option to continue  -> ");
            num=input.nextInt();
        }

        switch(num){
            case	1: LP_Monthly_installment();break;
            case	2: LP_Leasing_Category(); break;
            case	3: LP_Leasing_Amount(); break;
            case 	4: HomePage(); break;
        }
    }
    public static void LP_Monthly_installment(){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|             CALCULATE LEASING PAYMENT             |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");

        System.out.print("Enter lease amount         : ");
        double num=input.nextDouble();
        while(num<0){
            System.out.println("      Invalid lease amount... Enter the correct value again... \n");
            System.out.print("Enter lease amount         : ");
            num=input.nextDouble();
        }
        System.out.print("Enter annual interest rate : ");
        double i=input.nextDouble();
        while(i<0){
            System.out.println("      Invalid interesr rate... Enter the correct value again... \n");
            System.out.print("Enter annual interest rate : ");
            i=input.nextDouble();
        }

        System.out.print("Enter number of years      : ");
        double n=input.nextDouble();
        while(n<0 || n>5){
            System.out.println("      Invalid number of years... Enter the correct value again... \n");
            System.out.print("Enter number of years      : ");
            n=input.nextDouble();
        }
        double x = ((0.01*i)/12);
        double y = num*x;
        double total =(num*x)/(1-(1/(Math.pow((1+x), (n*12))))) ;
        System.out.println("\n");
        System.out.println("Your monthly instalment    : "+(double)Math.round(total * 100) / 100);

        System.out.println("\n\n");
        System.out.print("Do you want to calculate another Leasing Payment (Y/N): ");
        char ch=input.next().charAt(0);
        while(ch!='Y' && ch!='N'){
            System.out.print("Please enter Y or N only : ");
            ch=input.next().charAt(0);
        }
        if(ch=='Y'){
            LP_Monthly_installment();
        }
        else{
            clearConsole();
            HomePage();
        }
    }
    public static void LP_Leasing_Category(){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|              SEARCH LEASING CATEGORY              |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("");

        System.out.print("Enter lease amount         : ");
        double num=input.nextDouble();
        while(num<0){
            System.out.println("      Invalid lease amount... Enter the correct value again... \n");
            System.out.print("Enter lease amount         : ");
            num=input.nextDouble();
        }
        System.out.print("Enter annual interest rate : ");
        double i=input.nextDouble();
        while(i<0){
            System.out.println("      Invalid interesr rate... Enter the correct value again... \n");
            System.out.print("Enter annual interest rate : ");
            i=input.nextDouble();
        }
        double n;
        System.out.println("\n");
        for(n=3;n<6;n++){
            double x = ((0.01*i)/12);
            double y = num*x;
            double total =(num*x)/(1-(1/(Math.pow((1+x), (n*12))))) ;
            System.out.println("Your monthly instalment for "+(int)n+" year leasing plan - "+(double)Math.round(total * 100) / 100);
            System.out.println("");
        }
        System.out.println("\n\n");
        System.out.print("Do you want to calculate another Leasing Catagory (Y/N): ");
        char ch=input.next().charAt(0);
        while(ch!='Y' && ch!='N'){
            System.out.print("Please enter Y or N only : ");
            ch=input.next().charAt(0);
        }
        if(ch=='Y'){
            LP_Leasing_Category();;
        }
        else{
            clearConsole();
            HomePage();
        }
    }
    public static void LP_Leasing_Amount(){
        clearConsole();
        Scanner input=new Scanner(System.in);
        System.out.println("+----------------------------------------------------------------------+");
        System.out.println("|                        FINDING LEASING AMOUNT                        |");
        System.out.println("+----------------------------------------------------------------------+");
        System.out.println("");

        System.out.print("Enter the monthly lease payment amount you can afford          : ");
        double num=input.nextDouble();
        while(num<0){
            System.out.println("      Invalid lease amount... Enter the correct value again... \n");
            System.out.print("Enter the monthly lease payment amount you can afford         : ");
            num=input.nextDouble();
        }
        System.out.print("Enter annual interest rate                                     : ");
        double i=input.nextDouble();
        while(i<0){
            System.out.println("      Invalid interesr rate... Enter the correct value again... \n");
            System.out.print("Enter annual interest rate                                     : ");
            i=input.nextDouble();
        }

        System.out.print("Enter number of years                                          : ");
        double n=input.nextDouble();
        while(n<0 || n>5){
            System.out.println("      Invalid number of years... Enter the correct value again... \n");
            System.out.print("Enter number of years                                          : ");
            n=input.nextDouble();
        }
        double x = ((0.01*i)/12);
        double y = num*x;
        double total =(num*(1-(1/(Math.pow((1+x), (n*12))))))/x ;
        System.out.println("\n");
        System.out.println("You can get lease amount                                       : "+(double)Math.round(total * 100) / 100);

        System.out.println("\n\n");
        System.out.print("Do you want to calculate another Leasing Payment (Y/N): ");
        char ch=input.next().charAt(0);
        while(ch!='Y' && ch!='N'){
            System.out.print("Please enter Y or N only : ");
            ch=input.next().charAt(0);
        }
        if(ch=='Y'){
            LP_Leasing_Amount();;
        }
        else{
            clearConsole();
            HomePage();
        }
    }
}

