package com.musicstreaming;
	
	public class Main {
	    public static void main(String[] args) {
	        // Play music from local file with added features
	        MusicPlayer localFilePlayer = new MusicSource("LocalFile", "song.mp3");
	        MusicPlayer decoratedLocalFilePlayer = new MusicPlayerDecorater(localFilePlayer);
	        decoratedLocalFilePlayer.playing();
	
	        // Play music from online streaming with added features
	        MusicPlayer onlinePlayer = new MusicSource("OnlineStreaming", "http://musicstream.com/song");
	        MusicPlayer decoratedOnlinePlayer = new MusicPlayerDecorater(onlinePlayer);
	        decoratedOnlinePlayer.playing();
	
	        // Play music from radio with added features in the project
	        MusicPlayer radioPlayer = new MusicSource("Radio", "RadioStation101");
	        MusicPlayer decoratedRadioPlayer = new MusicPlayerDecorater(radioPlayer);
	        decoratedRadioPlayer.playing();
	    }
	}