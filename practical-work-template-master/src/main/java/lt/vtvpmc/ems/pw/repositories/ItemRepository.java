package lt.vtvpmc.ems.pw.repositories;

import lt.vtvpmc.ems.pw.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long>{
}
