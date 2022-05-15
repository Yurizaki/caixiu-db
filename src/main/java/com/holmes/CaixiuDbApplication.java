package com.holmes;

import com.holmes.user.model.User;
import com.holmes.user.repository.UserRepository;
import com.holmes.vocabulary.Vocabulary;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@SpringBootApplication
public class CaixiuDbApplication implements CommandLineRunner {

    @Autowired
    Environment environment;

//    @Value("$name")
//    private String name;

//    @Autowired
//    private UserRepository userRepository;

    private MongoOperations mongoOperations;


    public static void main(String[] args) {
        SpringApplication.run(CaixiuDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CaixiuDbApplication caixiuDbApplication = new CaixiuDbApplication();




//        MongoClient mongoClient = MongoClients.create(Objects.requireNonNull(environment.getProperty("host")));

//        MongoDatabase mongoDatabase = mongoClient.getDatabase("CaixiuDB");

//        MongoCollection<User> mongoCollection = mongoDatabase.getCollection("Users");

        mongoOperations = new MongoTemplate(
            MongoClients.create(Objects.requireNonNull(environment.getProperty("host"))),
            Objects.requireNonNull(environment.getProperty("database"))
        );

//        List<User> userList = mongoOps.find(new BasicQuery("{username:'?0'}", "ben"), User.class, "Users");


        mongoOperations.dropCollection("Vocabulary");


        if(mongoOperations.findById("123", User.class, "Users") == null) {
            mongoOperations.insert(new User("123", "ben", LocalDateTime.now()), "Users");
        }

//        String name = environment.getProperty("name");
//        userRepository.deleteAll();
//
//        User user = userRepository.findUserByUsername(name);
//        if(user == null) {
//            userRepository.save(new User("1", name, LocalDateTime.now()));
//            user = userRepository.findUserByUsername(name);
//        }
//
//        System.out.println("Item Name: " + user.getUsername());


        File file = new File("src/main/resources/chinese_vocabulary.data");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while(bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            if(!line.startsWith("-")) {
                System.out.println(line);

                String[] items = line.split(",");

                Query query = new Query();
                query.addCriteria(
                        Criteria.where("chinese").is(items[0])
                );
                Update update = new Update();
                update.set("chinese", items[0].trim());
                update.set("pinyin", items[1].trim());

                mongoOperations.upsert(query, update, "Vocabulary");
            }
        }
    }
}
