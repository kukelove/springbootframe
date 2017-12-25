package huan.service;

import huan.Repository.UserRepository;
import huan.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("userService")
@Transactional
class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(String name) {
        return this.userRepository.findByName(name);
    }

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }
}