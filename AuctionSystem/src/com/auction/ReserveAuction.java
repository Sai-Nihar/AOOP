package com.auction;

public class ReserveAuction extends AuctionProcess{
	private double reservePrice;
	
	public ReserveAuction(double reservePrice) {
        this.reservePrice = reservePrice;
    }

	@Override
	protected void listAuctionItem() {
		// TODO Auto-generated method stub
		notifyObservers("Item listed for reserve auction with reserve price: $" + reservePrice);
	}

	@Override
	protected void startBidding() {
		// TODO Auto-generated method stub
		notifyObservers("Bidding has started for the reserve auction.");
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		 notifyObservers("Bidding has ended for the reserve auction.");
	}

}
