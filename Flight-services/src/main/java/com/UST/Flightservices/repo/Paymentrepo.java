package com.UST.Flightservices.repo;

import com.UST.Flightservices.entity.Paymentinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Paymentrepo extends JpaRepository<Paymentinfo,String> {
}
