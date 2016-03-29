package com.standford;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StaffRepository extends CrudRepository<Staff, Long> {

	@Query("SELECT s FROM Staff s WHERE LOWER(s.lastName) = LOWER(:lastName)")
	List<Staff> findByLastName(@Param("lastName") String lastName);
	List<Staff> findByFirstName(String firstName);
	List<Staff> findByDepartmentId(long firstName);
}
