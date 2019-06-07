package com.cubic.banking.Autoloans.Dao;

import org.springframework.stereotype.Component;

@Component
public interface BaseDaoIf {
	Object save(Object o);
	Object update(Object o);
	Object delete(Object o);
	Object get(Object o);

}
