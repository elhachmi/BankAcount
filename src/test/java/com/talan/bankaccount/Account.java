package com.talan.bankaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AccountTests {

	@Test
	@DisplayName("Initial balance")
	void initialBalance() {
		Double initalBalance = 199.00;
		Account account = new Account(initalBalance);
		assertEquals(account.getBalance(), initalBalance);
	}

	@ParameterizedTest(name = "Initial {0} deposit amount {1} expexted {2}")
	@CsvSource({
			"10.00,	20.50,	30.50",
			"0.00,	20.90,	20.90",
	})
	void depositAmmount(Double initalBalance, Double amount, Double expectedBalance) {
		Account account = new Account(initalBalance);
		account.deposit(amount);
		assertEquals(expectedBalance, account.getBalance());
	}

	@ParameterizedTest(name = "Initial {0} widthraw amount {1} expexted {2}")
	@CsvSource({
			"100.00,	90.50,	9.50",
			"10.00,	10.00,	0.00",
	})
	void withdrawAmmount(Double initalBalance, Double amount, Double expectedBalance)
			throws NoSufficientFundsException {
		Account account = new Account(initalBalance);
		account.withdraw(amount);
		assertEquals(expectedBalance, account.getBalance());
	}

	@Test
	@DisplayName("Widthraw amount higher than current balance")
	void unSufficientFunds()  {
		Double initalBalance = 199.00;
		Double amount = 200.00;
		Account account = new Account(initalBalance);
		assertThrows(NoSufficientFundsException.class, () -> account.withdraw(amount));
	}

	@Test
	@DisplayName("Operations history")
	void operationsHistory() throws NoSufficientFundsException {
		Double initalBalance = 200.00;
		Account account = new Account(initalBalance);
		Deposit deposit = account.deposit(100.00);
		Withdrawal withdrawal = account.withdraw(50.00);
		ArrayList<Operation> operations = new ArrayList<Operation>();
		operations.add(deposit);
		operations.add(withdrawal);
		assertEquals(operations, account.getOperations());
	}

}
