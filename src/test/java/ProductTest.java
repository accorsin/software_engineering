import org.npc.dataaccess.repository.DatabaseTable;

import java.util.UUID;

public class ProductTest {

	public static void main(String[] args) {

		UUID id = UUID.fromString("ed5c1fa9-803c-4208-bf09-654f00200516");

		ProductRepository repository = new ProductRepository(DatabaseTable.PRODUCT);

		Product product = repository.get(id);

		System.out.println(product);

		boolean b = repository.exists(id);

		System.out.println(b);

	}
}
