
public class ToUpperCase extends AbstractString {

	public ToUpperCase(String input) {
		super(input);
	
	}

	@Override
	public boolean checkLength(String input) {
		String [] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(words.length==3) {
				return true;
			}
			
		}
		return false;
	}

	@Override
	public String modifyString(String input) {
		String [] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(this.checkLength(words[i])) {
				words[i]=words[i].toUpperCase();
				
			}
			
		}
		
		return String.join(" ", words);
	}
	

}
