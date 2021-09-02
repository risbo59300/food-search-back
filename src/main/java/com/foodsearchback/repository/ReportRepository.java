package com.foodsearchback.repository;

import com.foodsearchback.entities.FsReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<FsReport,Long> {
}
