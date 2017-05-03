package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Invoice;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AddNewInvoice {

    @PersistenceContext
    private EntityManager entityManager;

    private String date;
    private String company;
    private String recipient;


    @Transactional
    public String save() {
        Invoice invoice = new Invoice(date, company, recipient);
        entityManager.persist(invoice);
        return "main";
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
