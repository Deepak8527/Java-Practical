
class Customer {
    public static void main(String[] args)
    {
        
        Customer ob = new Customer("Deepak kumar", 1000, 5000);
        ob.pendingAmount();
        Customer ob1 = new Customer("prince", 500, 1000); 
        ob1.pendingAmount();
    }
// instance variable
String customerName;
double pharchaseAmount;
double amountPaid;
Customer(String customersName,double pharchaseAmount,double amountPaid)
{
    this.customerName = customersName;
    this.pharchaseAmount = pharchaseAmount;
    this.amountPaid = amountPaid;
}
void pendingAmount()
    {
        double penAmount = amountPaid - pharchaseAmount;
        System.out.println("Pending amount for customer " + customerName );
        System.out.println("Rs = " + penAmount);
    }
}
