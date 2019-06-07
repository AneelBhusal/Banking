package com.cubic.banking.Autoloans.DTO;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class PaymentsDTO {
	
	@Id
	@GeneratedValue
	private long paymentId;
	private double principal;
	private double lastPayment;
	private double nextPayment;
	private Date lastDue;
	private Date nextDue;
	private double amountPaid;
	
	
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getLastPayment() {
		return lastPayment;
	}
	public void setLastPayment(double lastPayment) {
		this.lastPayment = lastPayment;
	}
	public double getNextPayment() {
		return nextPayment;
	}
	public void setNextPayment(double nextPayment) {
		this.nextPayment = nextPayment;
	}
	public Date getLastDue() {
		return lastDue;
	}
	public void setLastDue(Date lastDue) {
		this.lastDue = lastDue;
	}
	public Date getNextDue() {
		return nextDue;
	}
	public void setNextDue(Date nextDue) {
		this.nextDue = nextDue;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

}
