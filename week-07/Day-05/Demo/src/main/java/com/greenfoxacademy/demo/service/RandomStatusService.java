package com.greenfoxacademy.demo.service;

import com.greenfoxacademy.demo.model.Status;
import com.greenfoxacademy.demo.model.StatusAndPath;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class RandomStatusService {

    private List<StatusAndPath> songs;
    private Random random;
    public RandomStatusService(){
        songs = new ArrayList<>();

        songs.add(new StatusAndPath("/hungry.mp3", Status.hungry,"/hungry.gif"));
        songs.add(new StatusAndPath("/sleep.mp3", Status.sleepy,"/sleep.gif"));
        songs.add(new StatusAndPath("/foxsong.mp3", Status.whatdoesthefoxsay,"/greenfox.png"));
        songs.add(new StatusAndPath("/thirsty.mp3", Status.thirsty,"/thirsty.gif"));
        songs.add(new StatusAndPath("/dying.mp3", Status.hplow,"/dying.gif"));
        songs.add(new StatusAndPath("/playwithme.mp3", Status.playwithme,"/playwithme.gif"));
        songs.add(new StatusAndPath("/japanese.mp3", Status.japanese,"/japanese.gif"));

        random = new Random();
    }

    private static final List<Status> VALUES = Arrays.stream(Status.values())
            .collect(Collectors.toList());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Status randomStatus()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public String getPath(Status status){
        return songs.stream().filter(x->x.getStatus() == status).findFirst().map(x->x.getUrl()).get();
    }
    public String getImagePath(Status status){
//        Status status = randomStatus();
        return songs.stream().filter(x->x.getStatus() == status).findFirst().map(x->x.getImagePath()).get();
    }

}
