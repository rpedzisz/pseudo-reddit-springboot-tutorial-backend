package com.example.pseudoreddit.controller;


import com.example.pseudoreddit.classes.SubredditEnc;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subreddit")
@AllArgsConstructor
@Slf4j
public class SubredditController {

    @PostMapping
    public void createSubreddit(@RequestBody SubredditEnc subredditEnc){



    }




}
