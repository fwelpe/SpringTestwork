package artifactId.repos;

import artifactId.domain.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepo extends CrudRepository<Items, Long> {

}
