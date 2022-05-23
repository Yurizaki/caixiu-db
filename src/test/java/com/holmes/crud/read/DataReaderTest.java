//package com.holmes.crud.read;
//
//import com.holmes.setup.CaixiuDbCollections;
//import com.holmes.setup.CaixiuMongoOperations;
//import com.holmes.vocabulary.Vocabulary;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//class DataReaderTest {
//
//    private DataReader<Vocabulary> vocabularyDataReader;
//
//    @BeforeEach
//    void setUp() {
//        String host = "mongodb://localhost:27017";
//        String database = "CaixiuDB";
//        CaixiuMongoOperations caixiuMongoOperations = new CaixiuMongoOperations(host, database);
//
//        this.vocabularyDataReader = new DataReader<>(
//                CaixiuDbCollections.VOCABULARY.getCollectionName(),
//                caixiuMongoOperations.getMongoOperations(),
//                Vocabulary.class);
//    }
//
//    @Test
//    void findAll() {
//        assertTrue(vocabularyDataReader.findAll().size() > 0);
//    }
//}