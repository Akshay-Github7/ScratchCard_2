package model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ScratchCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String scratchCardGUID;
    private String discount; // Consider using BigDecimal for monetary values
    private LocalDate scratchCardExpiryDate;
    private Boolean isActive;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getScratchCardGUID() {
		return scratchCardGUID;
	}
	public void setScratchCardGUID(String scratchCardGUID) {
		this.scratchCardGUID = scratchCardGUID;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public LocalDate getScratchCardExpiryDate() {
		return scratchCardExpiryDate;
	}
	public void setScratchCardExpiryDate(LocalDate scratchCardExpiryDate) {
		this.scratchCardExpiryDate = scratchCardExpiryDate;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
    
}