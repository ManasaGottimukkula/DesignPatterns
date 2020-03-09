package com.BridgePattern;
public class User {
  public static void main(String[] args) {
	Remote r = new Remote();
    TV samsungtv = new Samsung(r);
    samsungtv.on();
    samsungtv.volumeUp();
    samsungtv.volumeDown();
    samsungtv.off();
    System.out.println();
    
    
    TV panasonictv = new Panasonic(r);
    panasonictv.on();
    panasonictv.volumeUp();
    panasonictv.volumeDown();
    panasonictv.off();
    System.out.println();
    
    TV lgtv = new LG(r);
    lgtv.on();
    lgtv.volumeUp();
    lgtv.volumeDown();
    lgtv.off();
    
  }
}