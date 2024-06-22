package com.niq.activate.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.niq.activate.entity.ProductMetadata;

public interface ProductMetadataRepository extends JpaRepository<ProductMetadata, String> {
}

