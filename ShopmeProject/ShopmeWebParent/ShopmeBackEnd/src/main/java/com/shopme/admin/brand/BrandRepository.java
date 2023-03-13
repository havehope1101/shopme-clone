package com.shopme.admin.brand;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.shopme.common.entity.Brand;
import com.shopme.common.entity.Category;

public interface BrandRepository extends PagingAndSortingRepository<Brand, Integer>, CrudRepository<Brand, Integer> {

	Iterable<Brand> findAll();

	Optional<Brand> findById(int i);

	void deleteById(Integer id);
	
	public Long countById(Integer id);
	
	public Brand findByName(String name);

}