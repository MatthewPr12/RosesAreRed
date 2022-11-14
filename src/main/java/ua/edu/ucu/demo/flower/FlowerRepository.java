package ua.edu.ucu.demo.flower;

import org.apache.coyote.ajp.AjpAprProtocol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

    @Query
    Optional<Flower> findFlowerById(int id);
}
