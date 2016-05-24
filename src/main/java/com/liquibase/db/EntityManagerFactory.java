package com.liquibase.db;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerFactory {

	private EntityManagerFactory() {
	}

	static class Helper {
		public static EntityManager em = Persistence
				.createEntityManagerFactory("some-persistence")
				.createEntityManager();
	}

	public static EntityManager createEntityManager() {
		return Helper.em;
	}
}
