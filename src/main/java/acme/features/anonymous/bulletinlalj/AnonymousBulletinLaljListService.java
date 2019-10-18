
package acme.features.anonymous.bulletinlalj;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.BulletinLalj;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousBulletinLaljListService implements AbstractListService<Anonymous, BulletinLalj> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousBulletinLaljRepository repository;


	// AbstractListService<Anonymous, BulletinLalj> interface --------------

	@Override
	public boolean authorise(final Request<BulletinLalj> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<BulletinLalj> request, final BulletinLalj entity, final Model model) {

		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "event", "momentOfEvent", "location", "euros");
	}

	@Override
	public Collection<BulletinLalj> findMany(final Request<BulletinLalj> request) {
		assert request != null;

		Collection<BulletinLalj> result;
		result = this.repository.findMany();

		return result;
	}
}
