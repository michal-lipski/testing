package $mock.incomingQuery;

public class InvoiceService {

    private InvoiceDataFactory invoiceDataFactory;
    private InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceDataFactory invoiceDataFactory, InvoiceRepository invoiceRepository) {
        this.invoiceDataFactory = invoiceDataFactory;
        this.invoiceRepository = invoiceRepository;
    }

    public Invoices findAll() {

        InvoiceData invoiceData = invoiceDataFactory.create();
        Invoices invoices = invoiceRepository.findAll(invoiceData);

        return invoices;
    }
}
