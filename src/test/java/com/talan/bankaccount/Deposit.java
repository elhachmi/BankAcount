
package com.talan.bankaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DepositTests {

	@Test
	@DisplayName("Deposit object")
	void createDeposit() {
		long time = System.currentTimeMillis();
		Deposit deposit = new Deposit(100.00, 200.00);
		assertEquals(deposit.getType(), "DEPOSIT");
		assertEquals(deposit.getAmount(), 100.00);
		assertEquals(deposit.getBalance(), 200.00);
		assertTrue(deposit.getDate().getTime() >= time );
	}


}
