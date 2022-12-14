package com.sonata.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Topic;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	/*@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("Spring", "Spring framework", "Spring Example"),
				new Topic("Hibernate", "Hibernate framework", "Hibernate example"),
				new Topic("JavaScript", "JavaScript data", "JavaScript details")
				
				);
	}
	*/
	
	@RequestMapping("/show")
	public List<Topic> showTopics(){
		return topicService.getTopic();	
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getSingleTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
public void UpdateTopic(@RequestBody Topic topic, @PathVariable String id) {
	topicService.updateTopic(id, topic);
}

@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
public void DeleteTopic(@RequestBody Topic topic, @PathVariable String id) {
	topicService.deleteTopic(id, topic);
}

}
