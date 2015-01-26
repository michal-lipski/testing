package $mock.incomingQuery;

import static org.mockito.Mockito.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InvoiceFetchingTest {

    //integration test??

    @Test
    public void should_fetch_from_repository_using_invoice_data_from_factory() {
        InvoiceDataFactory invoiceDataFactory = mock(InvoiceDataFactory.class);
        InvoiceData invoiceData = new InvoiceData();
        when(invoiceDataFactory.create()).thenReturn(invoiceData);
        InvoiceRepository invoiceRepository = mock(InvoiceRepository.class);
        InvoiceService invoiceService = new InvoiceService(invoiceDataFactory, invoiceRepository);

        invoiceService.findAll();

        verify(invoiceDataFactory).create();
        verify(invoiceRepository).findAll(invoiceData);
    }

    @Test
    public void should_fetch_invoices() {
        InvoiceService invoiceService = new InvoiceService(
                new InvoiceDataFactoryStub(),
                new InvoiceRepositoryStub(new Invoice("123"), new Invoice("456")));

        Invoices invoices = invoiceService.findAll();

        Assertions.assertThat(invoices).containsOnly(new Invoice("123"), new Invoice("456"));
    }
}