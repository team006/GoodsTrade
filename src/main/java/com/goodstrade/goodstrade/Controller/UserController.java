package com.goodstrade.goodstrade.Controller;

import com.goodstrade.goodstrade.Model.Role;
import com.goodstrade.goodstrade.Model.User;
import com.goodstrade.goodstrade.Repository.UserRepository;
import com.goodstrade.goodstrade.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private static final String ADMIN_TEST_USER_NAME = "admin1";
    private static final String ADMIN_TEST_PASSWORD = "admin1";
    private static final String SELLER_TEST_USER_NAME = "seller1";
    private static final String SELLER_TEST_PASSWORD = "seller1";
    private static final String TEST_USER_NAME = "user1";
    private static final String TEST_PASSWORD = "user1";


    @Autowired
    private UserRepository userRepository;

    @GetMapping("/createadmin1")
    public String createTestAdmin1() {
        User user = userRepository.findByUsername("admin1");
        if(user != null) {
            return "User is created";
        }

        user = new User();
        user.setUsername(ADMIN_TEST_USER_NAME);
        user.setPassword(ADMIN_TEST_PASSWORD);
        user.setRole(Role.ROLE_ADMIN);
        user.setAddress("ads");
        user.setEmail("ass");
        user.setTel("0123");
        userRepository.save(user);

        return "Create test user";
    }

    @GetMapping("/createuser1")
    public String createTestUser1() {
        User user = userRepository.findByUsername("user1");
        if(user != null) {
            return "User is created";
        }

        user = new User();
        user.setUsername(TEST_USER_NAME);
        user.setPassword(TEST_PASSWORD);
        user.setRole(Role.ROLE_CLIENT);
        user.setAddress("ads");
        user.setEmail("ass");
        user.setTel("0123");
        userRepository.save(user);

        return "Create test user";
    }

    @GetMapping("/createseller1")
    public String createTestSeller1() {
        User user = userRepository.findByUsername("seller1");
        if(user != null) {
            return "User is created";
        }

        user = new User();
        user.setUsername(SELLER_TEST_USER_NAME);
        user.setPassword(SELLER_TEST_PASSWORD);
        user.setRole(Role.ROLE_SHOP);
        user.setAddress("ads");
        user.setEmail("ass");
        user.setTel("0123");
        userRepository.save(user);

        return "Create test user";
    }

    @GetMapping("/adminonly")
    public String adminOnly() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "This is ADMIN " + user.getUsername();
    }

    @GetMapping("/logedinOnly")
    public String logedInOnly() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "This is " + user.getUsername();
    }

    @GetMapping("/guestonly")
    public String guestOnly() {
        return "Only Guest Here";
    }

    @GetMapping("/all")
    public String all() {
        return "AnyOne Can Come here";
    }


}
