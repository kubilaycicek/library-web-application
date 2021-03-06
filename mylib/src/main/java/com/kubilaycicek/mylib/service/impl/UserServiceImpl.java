package com.kubilaycicek.mylib.service.impl;

import com.kubilaycicek.mylib.dto.UserDto;
import com.kubilaycicek.mylib.entity.User;
import com.kubilaycicek.mylib.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.kubilaycicek.mylib.repository.UserRepository;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username).orElse(null);
	}

	@Override
	public UserDto addUser(UserDto userDto) {

	return  null;
	}

	@Override
	public UserDto updateUser(UserDto userDto) {
		return null;
	}

	@Override
	public List<UserDto> getAllUser() {
		return null;
	}

	@Override
	public UserDto getByUserID(long userID) {
		return null;
	}

	@Override
	public boolean removeByUserID(long userID) {
		return false;
	}
}
