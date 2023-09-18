package com.codebase;

public class WaterBottle {
  public int volume = 100;

  public WaterBottle() {}

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public void drink() {
    volume -= 10;
  }

  public void empty() {
    volume = 0;
  }

  public void fill() {
    volume = 100;
  }
}

