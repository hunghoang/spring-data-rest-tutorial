package com.standford;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StaffServiceDemo {

	private StaffRepository staffRepository;
	private DepartmentRepository departmentRepository;

	@Autowired
	public StaffServiceDemo(StaffRepository staffRepository, DepartmentRepository departmentRepository) {
		this.staffRepository = staffRepository;
		this.departmentRepository = departmentRepository;
	}

	@PostConstruct
	public void demo() throws InterruptedException {
		System.out.println("========= Run demo application ============");
		Staff staff1 = new Staff("Anh", "Nguyen", 1);
		Staff staff2 = new Staff("Hoang", "Nguyen", 2);
		Staff staff3 = new Staff("Minh", "Le", 2);
		System.out.println("Save staff: " + staff1);
		staffRepository.save(staff1);
		System.out.println("Save staff: " + staff2);
		staffRepository.save(staff2);
		System.out.println("Save staff: " + staff3);
		staffRepository.save(staff3);

		String lastName = "Nguyen";
		System.out.println("Find all staff with lastName =  " + lastName);
		List<Staff> staffs = staffRepository.findByLastName(lastName);

		System.out.println("Results:");
		for (Staff staff : staffs) {
			System.out.println(staff);
		}
		
		String firstName = "Anh";
		System.out.println("Find all staff with firstName =  " + firstName);
		List<Staff> staffs2 = staffRepository.findByFirstName(firstName);
		
		System.out.println("Results:");
		for (Staff staff : staffs2) {
			System.out.println(staff);
		}
		
		
		long departmentId = 2;
		System.out.println("Find all staff in department =  " + departmentId);
		List<Staff> staffs3 = staffRepository.findByDepartmentId(departmentId);
		
		System.out.println("Results:");
		for (Staff staff : staffs3) {
			System.out.println(staff);
		}
		
		System.out.println("Create new department and assign staff to it");
		Department department = new Department("Human Resource");
		departmentRepository.save(department);
		Staff staff4 = new Staff("Long", "Nguyen", department.getDepartmentId());
		staffRepository.save(staff4);
		
	}
}
