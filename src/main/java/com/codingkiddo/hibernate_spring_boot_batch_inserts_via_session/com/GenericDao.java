package com.codingkiddo.hibernate_spring_boot_batch_inserts_via_session.com;

import java.io.Serializable;

public interface GenericDao<T, ID extends Serializable> {
	<S extends T> void saveInBatch(Iterable<S> entites);
}
