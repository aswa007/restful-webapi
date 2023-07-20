package com.in28minutes.web.restservices.restfulwebservices.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users= new ArrayList<>();
	
	private static int usersCount=0;
	
	
	static {
		users.add(new User(++usersCount,"Rakesh",LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount,"Shyam",LocalDate.now().minusYears(28)));
		users.add(new User(++usersCount,"Devanand",LocalDate.now().minusYears(23)));
	}
	public List<User>findAll(){
		return users;
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
		
	}
	public User findOne(int id) {
		Predicate<? super User> predicate=user-> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
			
	}
	public void deleteById(int id) {
		Predicate<? super User> predicate=user-> user.getId().equals(id);
			users.removeIf(predicate);
	}
	
	

	
}
