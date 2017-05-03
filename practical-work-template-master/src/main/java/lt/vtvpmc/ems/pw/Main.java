package lt.vtvpmc.ems.pw;

import lt.vtvpmc.ems.pw.entities.Invoice;
import lt.vtvpmc.ems.pw.repositories.InvoiceRepository;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
        InvoiceRepository ir = ac.getBean("invoiceRepository",InvoiceRepository.class);


       // Invoice in = new Invoice("2017-05-02", "Some Company", "Some Recipient");
        for (String item : ac.getBeanDefinitionNames()) {
            System.out.println(item);
        }
    }
}
