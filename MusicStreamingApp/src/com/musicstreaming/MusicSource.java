package com.musicstreaming;

public class MusicSource implements MusicPlayer {
    private String sourceType;
    private String sourceDetail;

    public MusicSource(String sourceType, String sourceDetail) {
        this.sourceType = sourceType;
        this.sourceDetail = sourceDetail;
    }

    @Override
    public void playing() {
        switch (sourceType) {
            case "LocalFile":
                System.out.println("Playing music from local file: " + sourceDetail);
                break;
            case "OnlineStreaming":
                System.out.println("Streaming music from: " + sourceDetail);
                break;
            case "Radio":
                System.out.println("Tuning into radio station: " + sourceDetail);
                break;
            default:
                System.out.println("Unknown music source.");
        }
    }
}