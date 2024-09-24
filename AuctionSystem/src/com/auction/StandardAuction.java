package com.auction;

public class StandardAuction extends AuctionProcess{

	@Override
	protected void listAuctionItem() {
		// TODO Auto-generated method stub
		 notifyObservers("Item listed for standard auction.");
	}

	@Override
	protected void startBidding() {
		// TODO Auto-generated method stub
		notifyObservers("Bidding has started for the standard auction.");
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		notifyObservers("Bidding has ended for the standard auction.");
	}

}
