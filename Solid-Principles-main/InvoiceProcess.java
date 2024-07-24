package SOLID_Principle;

public class InvoiceProcess implements Invoice {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}
