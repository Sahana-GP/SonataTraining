package com.sonata.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sonata.model.Topic;

@Service
public class TopicService {
	
	public List<Topic> topics = new ArrayList<> (Arrays.asList(
				new Topic("Spring", "Spring framework", "Spring Example"),
				new Topic("Hibernate", "Hibernate framework", "Hibernate example"),
				new Topic("JavaScript", "JavaScript data", "JavaScript details")
				));
	
	public List<Topic> getTopic(){
		return topics;
	}
	
	public Topic getSingleTopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
	
}
