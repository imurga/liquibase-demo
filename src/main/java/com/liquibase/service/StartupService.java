package com.liquibase.service;

import liquibase.exception.LiquibaseException;

import com.liquibase.db.DataBaseFactory;

public class StartupService {

	public void init() throws LiquibaseException {
		DataBaseFactory.runLiquiBaseScripts();
	}
}
