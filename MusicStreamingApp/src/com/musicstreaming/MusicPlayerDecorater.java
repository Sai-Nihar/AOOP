package com.musicstreaming;
	
	
	public class MusicPlayerDecorater implements MusicPlayer {
	    private MusicPlayer decoratedPlayer;
	
	    public MusicPlayerDecorater(MusicPlayer decoratedPlayer) {
	        this.decoratedPlayer = decoratedPlayer;
	    }
	
	    @Override
	    public void playing() {
	        decoratedPlayer.playing();
	        addEqualizer();
	        adjustVolume();
	    }
	
	    private void addEqualizer() {
	        System.out.println("Equalizer settings applied.");
	    }
	
	    private void adjustVolume() {
	        System.out.println("Volume adjusted.");
	    }
	}