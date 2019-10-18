
package acme.features.anonymous.bulletinlalj;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.BulletinLalj;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousBulletinLaljCreateService implements AbstractCreateService<Anonymous, BulletinLalj> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousBulletinLaljRepository repository;


	// AbstractCreateService<Anonymous, BulletinLalj> interface --------------

	@Override
	public boolean authorise(final Request<BulletinLalj> request) {
		assert request != null;

		return true;
	}

	@Override
	public BulletinLalj instantiate(final Request<BulletinLalj> request) {
		assert request != null;

		BulletinLalj result;
		Date moment = new Date(120, 3, 20, 21, 30);

		result = new BulletinLalj();
		result.setEvent("Going to Aquiarum from La Palmera");
		result.setMomentOfEvent(moment);
		result.setLocation("La Palmera");
		result.setEuros(12.);
		return result;
	}

	@Override
	public void unbind(final Request<BulletinLalj> request, final BulletinLalj entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "event", "momentOfEvent", "location", "euros");
	}

	@Override
	public void bind(final Request<BulletinLalj> request, final BulletinLalj entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<BulletinLalj> request, final BulletinLalj entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<BulletinLalj> request, final BulletinLalj entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}
}
