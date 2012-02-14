package web;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("autoModelValidator")
public class AutoModelValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		
		String model = (String) value;
		
		if (model.length() < 3) {
			FacesMessage message = new FacesMessage();
			message.setDetail("Nazwa modelu musi składać się z conajmniej 3 znakow");
			message.setSummary("Nazwa modelu musi składać się z conajmniej 3 znakow");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}
}
