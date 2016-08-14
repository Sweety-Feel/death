package app.bean.pojo;

import org.nutz.ioc.IocEventTrigger;

public class Onfetchpet implements IocEventTrigger<Pet>{

	public void trigger(Pet pet) {
		pet.setFetchCount(pet.getFetchCount() +1);
	}

}
