# kafka-standalone-client
Step to use this kafka simple client
- Prerequisite
	- Download http://www-eu.apache.org/dist/kafka/1.1.0/kafka_2.11-1.1.0.tgz 
	- tar -xzf kafka_2.11-1.1.0.tgz
	- cd kafka_2.11-1.1.0
	- bin/zookeeper-server-start.sh config/zookeeper.properties
	- bin/kafka-server-start.sh config/server.properties
	- bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic transcations
	- bin/kafka-topics.sh --list --zookeeper localhost:2181
	- bin/kafka-console-producer.sh --broker-list localhost:9092 --topic transcations
	- bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic transcations --from-beginning
	
- Through browser download source code from https://codeload.github.com/divang/kafka-standalone-client/zip/master
- unzip kafka-standalone-client-master.zip
- cd kafka-standalone-client-master
- mvn clean install
- cd target
- To run stand alone Consumer, it will connect to localhost:9092 broker
	- java -cp .:kafka-standalone-client-0.0.1-SNAPSHOT.jar  com.training.kafka.basic.consumer.ConsumerStandalone
- To run stand  alone Producer, it will connect to localhost:9092 broker
	- java -cp .:kafka-standalone-client-0.0.1-SNAPSHOT.jar  com.training.kafka.basic.producer.ProducerStandalone
