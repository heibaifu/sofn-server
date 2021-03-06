//package com.sofn.core;
//
//import com.sofn.core.support.mq.QueueSender;
//import com.sofn.core.support.mq.TopicSender;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@ComponentScan
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:Spring-config.xml" })
//public class MQTest {
//	@Autowired
//	private QueueSender queueSender;
//	@Autowired
//	private TopicSender topicSender;
//
//	@Test
//	public void test() {
//		queueSender.send("sofn.queue", "test");
//		topicSender.send("sofn.topic", "test");
//	}
//}
