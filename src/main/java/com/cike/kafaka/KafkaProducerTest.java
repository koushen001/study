package com.cike.kafaka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.Future;

/**
 * @Author Kou
 * @Date 2020/11/26
 * @Version 1.0
 **/
@Slf4j
public class KafkaProducerTest {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.10.233:9092");
        props.put("acks", "all");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(props);
        for (int i = 0; i < 5; i++) {
            ProducerRecord<String, String> producerRecord = new ProducerRecord<>("test_topic", null, i + "");
            Future<RecordMetadata> future = kafkaProducer.send(producerRecord);
            future.get();
            log.info("第{}条消息写入成功", i);
        }


    }
}
