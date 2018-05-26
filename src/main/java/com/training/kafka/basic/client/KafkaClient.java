package com.training.kafka.basic.client;

import com.training.kafka.basic.consumer.ConsumerStandalone;
import com.training.kafka.basic.producer.ProducerStandalone;

public class KafkaClient {

	public static void main(String[] args) {

		// Starting Kafka producer
		Thread producerThread = new Thread(new Runnable() {

			public void run() {
				ProducerStandalone.startProducer();
			}
		});
		producerThread.start();

		// Starting Kafka consumer
		Thread consumer = new Thread(new Runnable() {

			public void run() {
				ConsumerStandalone.startConsumer();
			}
		});
		consumer.start();
	}
}
