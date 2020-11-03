package com.crud.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.demo.model.Topic;



@Service
public class TopicService {

	private static List<Topic> topicList = new ArrayList<Topic>();
	
	static {
		Topic topic1 = new Topic(111,"core java","core java descrption");
		Topic topic2 = new Topic(222,"spring boot","spring boot descrption");
		Topic topic3 = new Topic(333,"javascript","java script descrption");
		topicList.add(topic1);
		topicList.add(topic2);
		topicList.add(topic3);
	}
	
	public List<Topic> getAllTopics() {
		return topicList;
	}
	
	public Topic getTopic(int id) {
		for(Topic topic: topicList) {
			if(topic.getId() == id) {
				return topic;
			}
		}
		return null;
	}
	
	public void addTopic(Topic topic) {
		topicList.add(topic);
	}
	public void updateTopic(int id, Topic updateTopic) {
		for(int i=0; i<topicList.size(); i++) {
			if(topicList.get(i).getId() == updateTopic.getId()) {
				topicList.set(i,updateTopic);
			}
		}
	}
	
	public void deleteTopic(int id) {
		for(Topic topic : topicList) {
			if(topic.getId() == id) {
				topicList.remove(topic);
				break;
			}
		}
		
	}
	
	
	
	
}
