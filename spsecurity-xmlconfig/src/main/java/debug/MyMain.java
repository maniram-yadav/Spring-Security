package debug;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyMain {

	public static void main(String[] args) {
		PasswordEncoder encoder=new BCryptPasswordEncoder();
		String password=encoder.encode("admin");
		System.out.println(password);

	}

}
