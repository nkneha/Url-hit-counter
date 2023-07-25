package com.example.URLHitCounter.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
    Map<String, Integer> hitCounts = new HashMap<>();
    private Integer countHit = 1;
    public int countHitInc() {
        return countHit++;
    }
    public Integer getHitCounts(String myUserName) {
        incrementHitCounts (myUserName);
        return hitCounts.get(myUserName);
    }

    private void incrementHitCounts(String myUserName) {

        int hitCount = hitCounts.getOrDefault(myUserName, 0);

        hitCount ++;
        hitCounts.put(myUserName, hitCount);

        countHit ++;
    }
}
