package com.greenfoxacademy.justforfun.service;

import com.greenfoxacademy.justforfun.model.Message;
import com.greenfoxacademy.justforfun.model.User;
import com.greenfoxacademy.justforfun.repository.PathRepository;
import com.greenfoxacademy.justforfun.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.file.Path;

import java.sql.*;

@Service
public class FoaasService {


    private PathRepository pathRepository;
    private UserRepository userRepository;

    @Autowired
    public FoaasService(PathRepository pathRepository, UserRepository userRepository) {
        this.pathRepository = pathRepository;
        this.userRepository = userRepository;
    }
//    @Autowired
//    public FoaasService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Autowired
//    public FoaasService(PathRepository pathRepository) {
//        this.pathRepository = pathRepository;
//    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    //mukodik
//    public Message getMotherFucker(User user) {
//        RestTemplate restTemplate = new RestTemplate();
//        String foaasResourceUrl
//                = "https://foaas.com" + pathRepository.getRandomPath();
//        String regexTarget1 = ":name";
//        String regexTarget2 = ":from";
//        foaasResourceUrl = foaasResourceUrl.replaceAll(regexTarget1, userRepository.getUserName());
//        foaasResourceUrl = foaasResourceUrl.replaceAll(regexTarget2, userRepository.getUserSentByMe());
//        Message message = restTemplate
//                .getForObject(foaasResourceUrl, Message.class);
//        return message;
//    }

    public Message getMotherFucker() {
        User user = userRepository.getNewestUser();
        RestTemplate restTemplate = new RestTemplate();
        String foaasResourceUrl
                = "https://foaas.com" + pathRepository.getRandomPath();
        String regexTarget1 = ":name";
        String regexTarget2 = ":from";
        foaasResourceUrl = foaasResourceUrl.replaceAll(regexTarget1, user.getName());
        foaasResourceUrl = foaasResourceUrl.replaceAll(regexTarget2, user.getSentByMe());
        Message message = restTemplate
                .getForObject(foaasResourceUrl, Message.class);
        return message;
    }

//    public Message getApiMessage(User user){
//        Message message = getMotherFucker(user);
//        return message;
//    }
}
