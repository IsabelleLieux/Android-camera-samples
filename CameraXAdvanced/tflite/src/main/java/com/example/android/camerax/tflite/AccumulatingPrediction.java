package com.example.android.camerax.tflite;

public class AccumulatingPrediction {
    String label;
    float totalScore;

    public AccumulatingPrediction(String label, float totalScore) {
        this.label = label;
        this.totalScore = totalScore;
    }

    public String getLabel() {
        return label;
    }


    public float getTotalScore() {
        return totalScore;
    }

    public void accumulateScore(float score) {
        this.totalScore += score;
    }
}
