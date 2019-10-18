
package acme.features.anonymous.bulletinlalj;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.bulletins.BulletinLalj;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousBulletinLaljRepository extends AbstractRepository {

	@Query("select b from BulletinLalj b")
	Collection<BulletinLalj> findMany();
}
