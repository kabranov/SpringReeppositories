package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "parking", path = "parking")
public interface ParkSpotRepository extends PagingAndSortingRepository<ParkSpot, Long>, CrudRepository<ParkSpot,Long> {

    List<Person> findByParkNumber(@Param("number") String number);

}

