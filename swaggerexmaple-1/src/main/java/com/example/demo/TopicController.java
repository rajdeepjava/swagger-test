package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicservice;
	
	@RequestMapping(method = RequestMethod.POST,value = "/topics")
	public void addtopic(@RequestBody Topic topic) {
		topicservice.addTopics(topic);
	}
}
