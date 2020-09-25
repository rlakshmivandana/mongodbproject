package learning.mongo.order.repository;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import learning.mongo.order.dto.OrderDto;

@Repository
public class OrderRepository {

	@Autowired
	private MongoDatabase mongoDB;

	public OrderDto findOrderById(String orderId) {
		OrderDto orderDto = null;
		MongoCollection<Document> mongocollection = getCollectionObject("order");
		Document searchQuery = new Document("orderId", orderId); // {"orderId":"1001"}

		Document orderDtoDocument = mongocollection.find(searchQuery).first();
		String orderDtoDocumentStr = orderDtoDocument.toJson();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			orderDto = objectMapper.readValue(orderDtoDocumentStr, OrderDto.class);
		} catch (Exception ex) {

		}

		return orderDto;

	}

	private MongoCollection<Document> getCollectionObject(String collectionName) {
		return mongoDB.getCollection(collectionName);
	}

}
