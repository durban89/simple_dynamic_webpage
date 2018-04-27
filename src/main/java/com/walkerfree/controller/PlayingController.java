package com.walkerfree.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.walkerfree.Playing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * PlayingController
 */
@RestController
public class PlayingController {
    private static final String template = "Playing %s!";
    private final AtomicLong atomic = new AtomicLong();

    @RequestMapping("/playing")
    public Playing playing(@RequestParam(value = "name", defaultValue = "football") String name) {
        return new Playing(atomic.incrementAndGet(), String.format(template, name));
    }

}