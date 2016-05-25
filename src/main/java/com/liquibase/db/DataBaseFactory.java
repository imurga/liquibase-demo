package com.liquibase.db;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;

import liquibase.exception.LiquibaseException;

import org.hibernate.Session;
import org.hibernate.internal.SessionImpl;

public class DataBaseFactory {

	private static final List<String> FILES = Arrays
			.asList("/liquibase/database-changelog.yaml");

	public static void runLiquiBaseScripts() throws LiquibaseException {
		LiquiBaseHelper.runScripts(getConnection(), FILES);
	}

	private static Connection getConnection() {
		SessionImpl session = (SessionImpl) EntityManagerFactory
				.createEntityManager().unwrap(Session.class);
		return session.connection();
	}
}
