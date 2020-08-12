package _00_Text_Funkifier;

public class ToCapsString extends SpecialString{

	public ToCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String funkyText = "";
		for(int i = 0; i < s.length(); i++) {
			funkyText = funkyText + Character.toUpperCase(s.charAt(i));
		}
		return funkyText;
	}

}
