package final_project.domain;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<MovieReservation, Long>{
	@Query(value = "SELECT * FROM movie_reservation ORDER BY id, number_of_tickets, movie_name",
			nativeQuery=true)
	public List<MovieReservation> findMoviesOrderByTickets();
}
