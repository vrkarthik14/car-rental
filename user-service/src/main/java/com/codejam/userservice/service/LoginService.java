package com.codejam.userservice.service;

import com.codejam.userservice.dto.LoginRequest;
import com.codejam.userservice.dto.SignUpRequest;
import com.codejam.userservice.entity.UserDetails;
import com.codejam.userservice.repository.UserDetailsRepository;
import com.codejam.userservice.utils.BUSINESS_CONSTANTS;
import com.codejam.userservice.utils.UserServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public void login(LoginRequest loginRequest) throws UserServiceException {
        UserDetails userDetails = userDetailsRepository.findByUserName(loginRequest.getUserName());
        if(null != userDetails && !userDetails.getPassword().equals(loginRequest.getPassword()))
            throw new UserServiceException("User credentials does not match!!!", BUSINESS_CONSTANTS.USER_CRED_MISMATCH.getValue());
        else if (null == userDetails)
            throw new UserServiceException("User not found", BUSINESS_CONSTANTS.USER_NOT_FOUND.getValue());
    }

    public void signUp(SignUpRequest request) throws UserServiceException  {

        UserDetails userDetails = UserDetails.builder().userName(request.getUserName()).
                                  password(request.getPassword()).build();
        String password = userDetailsRepository.findPasswordByUserName(request.getUserName());
        if(password !=null){
            throw new UserServiceException("User Already Exists!!!", BUSINESS_CONSTANTS.USER_ALREADY_EXISTS.getValue());
        }
        userDetailsRepository.save(userDetails);
    }

    public Long getUserId(String userName){

       Long userId = userDetailsRepository.findUserIdyUserName(userName);
        return userId;
    }
}
