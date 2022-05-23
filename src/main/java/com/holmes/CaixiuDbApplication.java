package com.holmes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoOperations;

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

        for(String s : args) {
            System.out.println(s);
        }
//        CaixiuDbApplication caixiuDbApplication = new CaixiuDbApplication();
//        mongoOperations = new MongoTemplate(
//            MongoClients.create(Objects.requireNonNull(environment.getProperty("host"))),
//            Objects.requireNonNull(environment.getProperty("database"))
//        );
//
//        if(!mongoOperations.collectionExists("Vocabulary")) {
//            mongoOperations.createCollection("Vocabulary");
//        }
////        mongoOperations.dropCollection("Vocabulary");
//
//        if(mongoOperations.findById("123", User.class, "Users") == null) {
//            mongoOperations.insert(new User("123", "ben", LocalDateTime.now()), "Users");
//        }
//
//        File file = new File("src/main/resources/chinese_vocabulary.data");
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//
//        List<Vocabulary> vocabDataLoad = new ArrayList<>();
//        List<Vocabulary> insertVocab = new ArrayList<>();
//        List<Vocabulary> updateVocab = new ArrayList<>();
//        List<Vocabulary> findResults = mongoOperations.findAll(Vocabulary.class, "Vocabulary");
//
//        while(bufferedReader.ready()) {
//            String line = bufferedReader.readLine();
//            if (!line.startsWith("-")) {
//                String[] items = line.split(",");
//                vocabDataLoad.add(new Vocabulary(items[0].trim(), items[1].trim()));
//            }
//        }
//
////        Query query = new Query();
////        query.addCriteria(criteriaDefinition);
////        query.addCriteria(
////                Criteria.where("chinese").is(items[0]).
////        );
//
//
//
//
//        for (Vocabulary vocabulary : vocabDataLoad) {
//            if(findResults.contains(vocabulary)) {
//                System.out.println("Contains " + vocabulary.getChinese());
//                updateVocab.add(vocabulary);
//            }
//            else {
//                insertVocab.add(vocabulary);
//            }
//        }
//
//        if(!insertVocab.isEmpty()) {
//            mongoOperations.insert(insertVocab, "Vocabulary");
//        }
//        if(!updateVocab.isEmpty()) {
////            mongoOperations.upda
//        }
    }
}
