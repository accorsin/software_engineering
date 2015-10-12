import org.npc.dataaccess.repository.BaseRepository;
import org.npc.dataaccess.repository.DatabaseTable;

public class ProductRepository extends BaseRepository<Product> {

	protected ProductRepository(DatabaseTable primaryTable) {
		super(primaryTable);
	}

	@Override
	protected Product createOne() {
		return new Product(this);
	}
}
