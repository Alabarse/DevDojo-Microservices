package academy.devdojo.youtube.coruse.repository;

import academy.devdojo.youtube.coruse.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{
    
    
}
