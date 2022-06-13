package com.wipro.womenempowerment.restrepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.womenempowerment.model.Ngo;

public interface NgoRepository extends JpaRepository<Ngo, Integer> {

	Ngo findById(int nId);

}
