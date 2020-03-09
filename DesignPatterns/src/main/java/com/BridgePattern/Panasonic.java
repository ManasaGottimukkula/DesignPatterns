package com.BridgePattern;
class Panasonic extends TV {
  Remote remoteType;
  
  Panasonic(Remote r) {
    super(r);
    this.remoteType = r;
  }
  
  public void on(){
    System.out.print("Panasonic TV ON: ");
    remoteType.on();
  }
    
  public void off(){
    System.out.print("Panasonic TV OFF: ");
    remoteType.off();
  }
  public void volumeUp(){
	  System.out.print("Panasonic TV VOLUp: ");
	  remoteType.volumeUp();
  }
  public void volumeDown(){
	  System.out.print("Panasonic TV VOLDown: ");
	  remoteType.volumeDown();
  }
}