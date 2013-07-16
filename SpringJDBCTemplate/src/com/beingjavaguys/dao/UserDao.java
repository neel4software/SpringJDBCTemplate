package com.beingjavaguys.dao;

import java.util.List;
import com.beingjavaguys.domain.User;

public interface UserDao {
	public void insertData(User user);

	public List<User> getUserList();

	public void updateData(User user);

	public void deleteData(String id);

	public User getUser(String id);

}
