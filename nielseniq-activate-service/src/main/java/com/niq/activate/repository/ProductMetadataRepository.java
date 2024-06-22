package com.niq.activate.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niq.activate.entity.ProductMetadata;

@Repository
public interface ProductMetadataRepository extends JpaRepository<ProductMetadata, String> {
}

