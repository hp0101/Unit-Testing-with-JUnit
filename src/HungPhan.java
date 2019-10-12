public class HungPhan {
	
	String fullName = "Hung Phan";
    String firstName = "Hung";
	String lastName = "Phan";
	String UCInetID = "hpphan";
	int studentNumber = 20243133;
	
	
	public String getFullName() {
		return fullName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getUCInetID() {
		return UCInetID;
	}

	public int getStudentNumber() {
		return studentNumber;
	}
	
	public String getRotatedFullName(int shift) {
		String result = "";
		
		if (shift < 0 && (shift * -1) > fullName.length()) {
			result = "Shift value is out of bound";
		}
		else if (shift > fullName.length()) {
			result = "Shift value is out of bound";
		}
		else if (shift == 0) {
			result = fullName;
		}
		else if (shift > 0) {
			String[] arr = fullName.split("");

			// extract Hu
			int arrLen = arr.length;
			String[] temp = new String[arrLen];
			for (int i = 0; i < arrLen; i++) {
				if (shift + i < arrLen) {
					temp[i] = arr[shift + i];
				}
			}
			
			// concatenate "ng Phan" to "Hu" -> "ng PhanHu"
			int count = 0;
			for (int i = shift - 1; i >= 0; i--) {
				temp[arrLen - 1 - count] = arr[i];
				count++;
			}
			
			result = String.join("", temp);
		} 
		else if (shift < 0) {
			shift = shift * (-1);
			
			String[] arr = fullName.split("");

			int arrLen = arr.length;
			String[] temp = new String[arrLen];
			
			// extract Phan
			int count = 0;
			for (int i = arrLen - shift; i < arrLen; i++) {
				temp[count] = arr[i];
				count++;
			}
			
			// concatenate "Phan" to "Hung " -> "PhanHung "
			int anotherCount = 0;
			for (int i = shift; i < arrLen; i++) {
				temp[i] = arr[anotherCount];
				anotherCount++;
			}
			
			result = String.join("", temp);
			
		}
		
		return result;
	}
}
