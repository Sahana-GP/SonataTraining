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
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		for(int i = 0; i<topics.size(); i++) {
		Topic t = topics.get(i);
		if(t.getId().equals(id)) {
			topics.set(i, topic);
			return;
		}
		}
		}
	
	public void deleteTopic(String id, Topic topic) {
		topics.removeIf(t->t.getId().equals(id));
	}
	
}
