package co.grandcircus.assessment6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.assessment6.model.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {

}
