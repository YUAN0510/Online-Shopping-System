package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;


//CRUD (create,read,update,delete)
public interface IngredientRepository extends CrudRepository<Ingredient,String> {
}
