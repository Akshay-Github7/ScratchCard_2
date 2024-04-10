package model;

public class UserScratchCardReport {
	private String userId;
    private double totalAmountWon;
    private int numberOfUnscratchedCards;

    // Constructors, getters, and setters
	
    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public double getTotalAmountWon() {
		return totalAmountWon;
	}
	public void setTotalAmountWon(double totalAmountWon) {
		this.totalAmountWon = totalAmountWon;
	}
	public int getNumberOfUnscratchedCards() {
		return numberOfUnscratchedCards;
	}
	public void setNumberOfUnscratchedCards(int numberOfUnscratchedCards) {
		this.numberOfUnscratchedCards = numberOfUnscratchedCards;
	}
	
}
