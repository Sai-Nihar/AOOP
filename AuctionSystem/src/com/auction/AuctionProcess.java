package com.auction;

import java.util.ArrayList;
import java.util.List;

public abstract class AuctionProcess implements Auction{
	private List<Bidder> bidders = new ArrayList<>();

    public final void startAuction() {
        notifyObservers("Auction is about to start!");
        listAuctionItem();
        startBidding();
        endBidding();
        notifyObservers("Auction has ended!");
    }

    public void addObserver(Bidder bidder) {
        bidders.add(bidder);
    }

    public void removeObserver(Bidder bidder) {
        bidders.remove(bidder);
    }

    public void notifyObservers(String message) {
        for (Bidder bidder : bidders) {
            bidder.update(message);
        }
    }

    protected abstract void listAuctionItem();
    protected abstract void startBidding();
    protected abstract void endBidding();

}
