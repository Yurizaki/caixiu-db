//package com.holmes.setup;
//
//import com.mongodb.client.MongoClients;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//@Configuration
//public class CaixiuMongoOperations {
//
//    private final MongoOperations mongoOperations;
//
//    public CaixiuMongoOperations(String host, String database) {
//        mongoOperations = new MongoTemplate(MongoClients.create(host), database);
//    }
//
//    public MongoOperations getMongoOperations() {
//        return this.mongoOperations;
//    }
//}
