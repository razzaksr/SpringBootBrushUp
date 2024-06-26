package sample.annamalai.demo_annamalai;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
CRUD Operations:
save>> insert/update
delete>> delete
findAll>> all records
findById>> fetch by primary key>> KYC>> Optional<KYC>
findAllByAttribute:
    eg: findAllByAccStatus>> List<KYC>
 */
// stereotype type: repository, service, controller, component, configuration

@Repository
public interface KycRepository extends JpaRepository<KYC,Long> {
    List<KYC> findAllByAccBalance(double accBalance);
}
