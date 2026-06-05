
public class P11_Email_Validate {

	public static void main(String[] args) {

		String email = "sanjay_100@gmail.com";

		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

		if (email.matches(regex)) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid Email");
		}
	}
}