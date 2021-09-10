public static String solution(String new_id) {

		new_id = new_id.toLowerCase().replaceAll("[^a-z_0-9_\\-\\_\\.]", "").replaceAll("\\.{2,}+", ".").replaceAll("^[\\.]", "").replaceAll("[\\.]*$", "");
		
		if(new_id.length() > 15) {
			new_id = new_id.substring(0, 15).replaceAll("[\\.]*$", "");
		}
		
		else if(new_id.length()==0){
			new_id = "a";
		}
		
		if(new_id.length()<=2) {
			String add = new_id.substring(new_id.length()-1, new_id.length());
			
			while(new_id.length()<=2) {
				new_id += add;
			}
		}
				
		return new_id;
	}
