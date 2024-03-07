package repository;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import model.BTI;

@Repository
public interface BTIRepository extends CrudRepository<BTI, java.math.BigDecimal> {

    }