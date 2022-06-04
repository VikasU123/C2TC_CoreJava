
public class InitObjLogSnip {

	public static void main(String[] args) {
		InitObjLogSnip obj = new InitObjLogSnip();
		obj.start();
	}
    void start() {
    	String stra = "do";
    	String strb = method(stra);
    	System.out.println(": "+stra+strb);
    }
    String method(String stra) {
    	stra = stra + "goog";
    	System.out.println(stra);
    	return "good";
    }
}
