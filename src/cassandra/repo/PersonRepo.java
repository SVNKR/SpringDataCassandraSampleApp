package cassandra.repo;

import org.springframework.data.repository.CrudRepository;

import cassandra.entity.Person;

public interface PersonRepo extends CrudRepository<Person, String>
{

}
