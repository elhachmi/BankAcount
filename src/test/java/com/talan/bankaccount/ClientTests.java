
package com.talan.bankaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClientTests {

	@Test
	@DisplayName("Set Full Name")
	void setFullName() {
		Client client = new Client();
		client.setFullname("Foo bar");
		assertEquals(client.getFullname(), "Foo bar");
	}

	@Test
	@DisplayName("Set Account")
	void setAccount() {
		Client client = new Client();
		client.setAccount(new Account(200.00));
		assertTrue(client.getAccount() instanceof Account);
	}

}
