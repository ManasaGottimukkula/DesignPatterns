package com.BridgePattern;
class LG extends TV {
  Remote remoteType;
  LG(Remote r) {
    super(r);
    this.remoteType = r;
  }
  
  public void on(){
    System.out.print("LG TV ON: ");
    remoteType.on();
  }
    
  public void off(){
    System.out.print("LG TV OFF: ");
    remoteType.off();
  }
  public void volumeUp() {
	  System.out.print("LG TV VOLUp: ");
	  remoteType.volumeUp(); 
  }
  public void volumeDown() {
	  System.out.print("LG TV VOLDown: ");
	  remoteType.volumeDown(); 
  }
}