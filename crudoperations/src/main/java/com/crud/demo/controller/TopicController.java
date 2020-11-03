package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.model.Topic;
import com.crud.demo.service.TopicService;



@RestController
public class TopicController {

@Autowired
private TopicService topicService;
	
@GetMapping("/topics")
public List<Topic> getAllTopics(){
	return topicService.getAllTopics();
}
	
@GetMapping("/topics/{id}")
public Topic getTopic(@PathVariable int id) {
	return topicService.getTopic(id);
}
@PostMapping("/topics")
public void addTopic(@RequestBody Topic topic) {
	topicService.addTopic(topic);
}
@PutMapping("/topics/{id}")
public void updateTopic(@PathVariable int id, @RequestBody Topic topic) {
	topicService.updateTopic(id, topic);
}

@DeleteMapping("/topics/{id}")
public void deleteTopic(@PathVariable int id) {
	topicService.deleteTopic(id);
}
}
