package com.returnordermanag.componentProcessModule.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PaymentTest {
	Payment payment = new Payment();

	@Test
	void testGetRequestID() {
		payment.setRequestID(11);
		assertEquals(11, payment.getRequestID());
	}

	@Test
	void testSetRequestID() {
		payment.setRequestID(11);
		assertEquals(11, payment.getRequestID());
	}

	@Test
	void testGetCreditCardNumber() {
		payment.setCreditCardNumber(1234567890);
		assertEquals(1234567890, payment.getCreditCardNumber());
	}

	@Test
	void testSetCreditCardNumber() {
		payment.setCreditCardNumber(1234567890);
		assertEquals(1234567890, payment.getCreditCardNumber());
	}

	@Test
	void testGetCreditLimit() {
		payment.setCreditLimit(5000.0);
		assertEquals(5000.0, payment.getCreditLimit());
	}

	@Test
	void testSetCreditLimit() {
		payment.setCreditLimit(5000.0);
		assertEquals(5000.0, payment.getCreditLimit());
	}

	@Test
	void testGetProcessingCharge() {
		payment.setProcessingCharge(5000.0);
		assertEquals(5000.0, payment.getProcessingCharge());
	}

	@Test
	void testSetProcessingCharge() {
		payment.setProcessingCharge(5000.0);
		assertEquals(5000.0, payment.getProcessingCharge());
	}
}
