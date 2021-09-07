package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class TopicService{

	
	               
	public List<Topic> getAllProducts() {
		List<Topic> listooftopics=new ArrayList<>();
		listooftopics.add(new Topic("123","tea","aaa"));
		listooftopics.add(new Topic("124","Coffee","bb"));
		listooftopics.add(new Topic("125","bread","yy"));
		
		return listooftopics;
			
		}
		
		public void addTopics(Topic topic) {
			// TODO Auto-generated method stub
			topic.setId("126");
			topic.setName("test");
			topic.setType("ok");
			
		}
}
