package org.cyk.system.reference.server.persistence.impl.integration;

import org.cyk.system.reference.server.persistence.entities.Reference;
import org.cyk.utility.server.persistence.test.TestPersistenceCreate;
import org.cyk.utility.server.persistence.test.arquillian.AbstractPersistenceArquillianIntegrationTestWithDefaultDeployment;
import org.junit.Test;

public class ReferencePersistenceIntegrationTest extends AbstractPersistenceArquillianIntegrationTestWithDefaultDeployment {
	private static final long serialVersionUID = 1L;
	
	@Test
	public void create_reference() throws Exception{
		String identifier = __getRandomIdentifier__();
		Reference reference = new Reference().setIdentifier(identifier).setValue("ref01");
		__inject__(TestPersistenceCreate.class).addObjects(reference).execute();
	}
	
}
