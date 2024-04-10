package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.ScratchCardService;

@RestController
@RequestMapping("/api/scratchcards")
public class ScratchCardController {

    @Autowired
    private ScratchCardService scratchCardService;

    // Define endpoints for scratch card operations
    // Example: Generate new scratch cards
    @PostMapping("/generate")
    public ResponseEntity<Void> generateScratchCards(@RequestBody GenerateScratchCardRequest request) {
        scratchCardService.generateAndDeactivateScratchCards(request.getQuantity(), request.getExpiryDate(), request.isDeactivateOld());
        return ResponseEntity.ok().build();
    }

    // Additional methods as needed for your application
}