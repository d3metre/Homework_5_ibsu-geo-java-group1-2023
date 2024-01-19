package ge.ibsu.demo.repository;

import ge.ibsu.demo.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
