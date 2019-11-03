package com.thomasmore.Schilderij.repository;

import com.thomasmore.Schilderij.entity.Schilderij;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface SchilderijRepository extends JpaRepository<Schilderij, Integer> {
    Schilderij findSchilderijByNaam(@Param("naam") String naam);
    Schilderij findSchilderijBySchilderijID(@Param("schilderijID") Integer schilderijID);
}
