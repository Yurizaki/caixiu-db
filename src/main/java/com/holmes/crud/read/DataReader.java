//package com.holmes.crud.read;
//
//import org.springframework.data.mongodb.core.MongoOperations;
//
//import java.util.List;
//
//public class DataReader<T> {
//
//    private Class<T> dataClass;
//
//    private String collection;
//
//    private MongoOperations mongoOperations;
//
//    public DataReader(String collection, MongoOperations mongoOperations, Class<T> dataClass) {
//        this.collection = collection;
//        this.mongoOperations = mongoOperations;
//        this.dataClass = dataClass;
//    }
//
//    public List<T> findAll() {
//        return mongoOperations.findAll(dataClass, collection);
//    }
//}
