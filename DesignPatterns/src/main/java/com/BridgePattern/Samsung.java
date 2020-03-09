package com.BridgePattern;
class Samsung extends TV {
  Remote remoteType;
  Samsung(Remote r) {
    super(r);
    this.remoteType = r;
  }
  
  public void on(){
    System.out.print("Samsung TV ON: ");
    remoteType.on();
  }
    
  public void off(){
    System.out.print("Samsung TV OFF: ");
    remoteType.off();
  }
  public void volumeUp() {
	  System.out.print("Samsung TV VOLUp: ");
	  remoteType.volumeUp(); 
  }
  public void volumeDown() {
	  System.out.print("Samsung TV VOLDown: ");
	  remoteType.volumeDown(); 
  }
}