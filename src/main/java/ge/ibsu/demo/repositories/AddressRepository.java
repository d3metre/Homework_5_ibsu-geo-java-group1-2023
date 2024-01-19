package ge.ibsu.demo.repository;

import ge.ibsu.demo.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
