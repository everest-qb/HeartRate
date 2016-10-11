package tw.everest.jni.test01;

public class Pedometer {
	
	public native void InitAlgo(char range);
	public native short ProcessAccelarationData(short x,short y,short z);
	public native void ResetAlgo();
	public native void  ResetStepCount ();
	public native char GetBandwidthSwitchInfo();
	public native long GetStepCount();
	
	static {
		System.loadLibrary("PiLib");
	}

}
