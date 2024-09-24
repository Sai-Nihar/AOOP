package com.auction;

public class Client {
	 public static void main(String[] args) {
	        
	        Bidder bidder1 = new AuctionBidder("Sai");
	        Bidder bidder2 = new AuctionBidder("SrujanC");

	        AuctionProcess standardAuction = new StandardAuction();
	        standardAuction.addObserver(bidder1);
	        standardAuction.addObserver(bidder2);
	        standardAuction.startAuction();

	        AuctionProcess reserveAuction = new ReserveAuction(1000);
	        reserveAuction.addObserver(bidder1); 
	        reserveAuction.startAuction();
	    }

}
