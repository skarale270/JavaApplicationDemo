package com.example.demoProject;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {

        // Replace the placeholder with your MongoDB deployment's connection string
//        String uri = "mongodb+srv://karalesuraj27416_db_user:karalesuraj27416_db_user@cluster0.ywqrzyh.mongodb.net/?appName=Cluster0";
//        try (MongoClient mongoClient = MongoClients.create(uri)) {
//            MongoDatabase database = mongoClient.getDatabase("java");
//            MongoCollection<Document> collection = database.getCollection("user");
//            Document doc = (Document) collection.find(eq("title", "Back to the Future")).first();
//            if (doc != null) {
//                System.out.println(doc.toJson());
//            } else {
//                System.out.println("No matching documents found.");
//            }
//        }
        SpringApplication.run(DemoProjectApplication.class, args);
	}

}
