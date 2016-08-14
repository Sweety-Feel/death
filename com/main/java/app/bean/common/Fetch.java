package app.bean.common;

import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.json.JsonLoader;

import app.bean.pojo.Pet;

public class Fetch {

	public static void main(String[] args) {
		Ioc ioc = new NutIoc(new JsonLoader("app/bean/pojo/nutz.js"));
		Pet pet = ioc.get(Pet.class, "xb");
		ioc.get(Pet.class,"xb");
		ioc.get(null,"xb");
		System.out.printf("%s be fetched  %s times,his friend is %s age is %s", pet.getName(),pet.getFetchCount(),pet.getFriend().getName(),pet.getFriend().getAge());
	}

}
