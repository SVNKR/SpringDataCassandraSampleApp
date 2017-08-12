package cassandra.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.cassandra.repository.Query;
import cassandra.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, String>
{

    @Query("select * from person where pid = ?0")
    Iterable<Person> findByPId(int id);
    
    @Query("select * from person where name = ?0")
    Iterable<Person> findByName(String name);
    
    @Query("select * from person where pid = ?0 and name=?1")
    Iterable<Person> findByPIdAndName(int id, String name);
}
