package org.anyframe.cargotracker.infrastructure.persistence.jpa;

import org.anyframe.cargotracker.domain.model.location.Location;
import org.anyframe.cargotracker.domain.model.location.LocationRepository;
import org.anyframe.cargotracker.domain.model.location.UnLocode;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Repository
public class JpaLocationRepository implements LocationRepository, Serializable {

    private static final long serialVersionUID = 1L;
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Location find(UnLocode unLocode) {
        return entityManager.createNamedQuery("Location.findByUnLocode",
                Location.class).setParameter("unLocode", unLocode)
                .getSingleResult();
    }

    @Override
    public List<Location> findAll() {
        return entityManager.createNamedQuery("Location.findAll", Location.class)
                .getResultList();
    }
}
