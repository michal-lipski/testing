package $mock.incomingQuery;

import static com.google.common.collect.Lists.newArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Invoices implements Iterable<Invoice>{

    List<Invoice> invoiceList = new ArrayList<Invoice>();

    @Override
    public Iterator<Invoice> iterator() {
        return invoiceList.iterator();
    }
}
