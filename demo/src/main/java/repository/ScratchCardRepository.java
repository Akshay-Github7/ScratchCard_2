package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.ScratchCard;

@Repository
public interface ScratchCardRepository extends JpaRepository<ScratchCard, Long> {
}