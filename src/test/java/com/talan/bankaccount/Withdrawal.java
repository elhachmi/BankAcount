
package com.talan.bankaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WithdrawalTests {

	@Test
	@DisplayName("Withdrawal object")
	void createWithdrawal() {
		long time = System.currentTimeMillis();
		Withdrawal withdrawal = new Withdrawal(100.00, 200.00);
		assertEquals(withdrawal.getType(), "WITHDRAWAL");
		assertEquals(withdrawal.getAmount(), 100.00);
		assertEquals(withdrawal.getBalance(), 200.00);
		assertTrue(withdrawal.getDate().getTime() >= time );
	}


}
