package cassandra.main;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import cassandra.entity.Person;
import cassandra.repo.PersonRepo;


public class Application
{
		public static void main(String[] args)
		{
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new ClassPathResource("cassandra/resources/spring-config.xml").getPath());
				PersonRepo personRepo = context.getBean(PersonRepo.class);
				Person personAchilles = new Person();
				personAchilles.setpId(3);
				personAchilles.setName("Achilles2");
				personRepo.save(personAchilles);
				Person personHektor = new Person();
				personHektor.setpId(4);
				personHektor.setName("Hektor2");
				personRepo.save(personHektor);
				
				Iterable<Person> personList = personRepo.findAll();
				System.out.println("Person List : ");
				for (Person person : personList)
        {
		        System.out.println(person);
        }
				
				context.close();

		}
}
