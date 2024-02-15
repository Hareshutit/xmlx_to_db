package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Accounting;

@Repository
public interface AccountingRepository extends JpaRepository<Accounting, Long> {

    }