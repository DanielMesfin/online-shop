package com.daniel.Gebiya.view;
import com.daniel.Gebiya.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.daniel.Gebiya.model.User;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private  final UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public User addUser(User user){
    user.setUserCode(UUID.randomUUID().toString());
    return userRepo.save(user);
    }
    public List<User> findAllUser(){
        return userRepo.findAll();
    }
    public User UpdateUser(User userToBeUpdated){
        return userRepo.save(userToBeUpdated);
    }
    public void deleteUser(Long userId){
       userRepo.deleteUserByUserId(userId);
    }


    public User findUserByUserId(Long id) {
        return  userRepo.findUserByUserId(id);
    }
}
