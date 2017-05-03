package lt.vtvpmc.ems.pw.repositories;

import lt.vtvpmc.ems.pw.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
