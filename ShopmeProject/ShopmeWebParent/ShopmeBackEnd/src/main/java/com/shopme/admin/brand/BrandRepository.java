package com.shopme.admin.brand;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shopme.common.entity.Brand;

public interface BrandRepository extends PagingAndSortingRepository<Brand, Integer> {

	Brand save(Brand apple);

	Iterable<Brand> findAll();

	Optional<Brand> findById(int i);

	void deleteById(Integer id);

}