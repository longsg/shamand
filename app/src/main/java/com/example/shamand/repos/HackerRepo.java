package com.example.shamand.repos;

import retrofit2.Call;

enum StoryType { topStories, newStory }
public interface HackerRepo {
    String baseUrl = "https://hacker-news.firebaseio.com/v0/";
    
}
