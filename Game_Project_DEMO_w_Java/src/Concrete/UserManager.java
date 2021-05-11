package Concrete;

import Abstract.UserService;
import Abstract.ValidationService;
import Entity.User;

public class UserManager implements UserService {

	ValidationService validationService;

	public UserManager(ValidationService validationService) {
		this.validationService = validationService;
	}

	@Override
	public void add(User user) {

		if (validationService.validate(user)) {
			System.out.println("Kullanýcý eklendi:" + user.getFirstName());
		} else {
			System.out.println("Geçersiz kullanýcý");
		}
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi:" + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi:" + user.getFirstName());

	}

}
