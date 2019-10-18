
package acme.features.anonymous.bulletinlalj;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.bulletins.BulletinLalj;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/bulletin-lalj/")
public class AnonymousBulletinLaljController extends AbstractController<Anonymous, BulletinLalj> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousBulletinLaljListService	listService;
	@Autowired
	private AnonymousBulletinLaljCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}
