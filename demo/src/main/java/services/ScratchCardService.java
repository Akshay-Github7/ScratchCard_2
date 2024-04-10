package services;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.ScratchCard;
import repository.ScratchCardRepository;

@Service
public class ScratchCardService {

    private final ScratchCardRepository scratchCardRepository;

    @Autowired
    public ScratchCardService(ScratchCardRepository scratchCardRepository) {
        this.scratchCardRepository = scratchCardRepository;
    }

    public ScratchCard createScratchCard(ScratchCard scratchCard) {
        scratchCard.setScratchCardGUID(UUID.randomUUID().toString());
        scratchCard.setIsActive(true);
        return scratchCardRepository.save(scratchCard);
    }

    public void generateAndDeactivateScratchCards(int quantity, LocalDate expiryDate, boolean deactivateOld) {
        if (deactivateOld) {
            List<ScratchCard> activeCards = scratchCardRepository.findAll();
            activeCards.forEach(card -> {
                card.setIsActive(false);
                scratchCardRepository.save(card);
            });
        }
        for (int i = 0; i < quantity; i++) {
            ScratchCard newCard = new ScratchCard();
            newCard.setIsActive(true);
            newCard.setScratchCardExpiryDate(expiryDate);
            createScratchCard(newCard);
        }
    }

    public List<ScratchCard> getAllActiveScratchCards() {
        return scratchCardRepository.findAllByIsActive(true);
    }

    // Additional methods as needed for your application
}