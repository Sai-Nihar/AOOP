package com.auction;

public class AuctionBidder implements Bidder{
	 private String name;

	    public AuctionBidder(String name) {
	        this.name = name;
	    }

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		 System.out.println(name + " received notification: " + message);
	}

}
