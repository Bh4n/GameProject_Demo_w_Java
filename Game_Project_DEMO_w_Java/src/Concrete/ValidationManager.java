package Concrete;

import Abstract.ValidationService;
import Entity.User;

public class ValidationManager implements ValidationService{

	@Override
	public boolean validate(User user) {	
		return true;
	}

}
