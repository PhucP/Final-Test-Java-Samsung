package com.example.demo.Services;

import org.springframework.stereotype.Service;
import com.example.demo.Entities.User.RegisterDto;
import com.example.demo.Entities.User.User;
import com.example.demo.Repositories.IUserRepo;

@Service
public class UserService {
    private final IUserRepo userRepo;

    public UserService(IUserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void register(RegisterDto dto) {
        User newUser = new User();
        newUser.setEmail(dto.email);

        //Todo the password must be changed
        newUser.setPassword(dto.password);

        newUser.setFullname(dto.fullname);
        newUser.setPhonenumber(dto.phonenumber);
        userRepo.save(newUser);
    }

}
