package com.java.model;

import java.io.Serializable;
import java.sql.Clob;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Version;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Where;

import com.java.util.CardIssuedConverter;

@Entity
@SqlResultSetMapping(name="idAmount",
					entities= {@EntityResult(
							entityClass=Account.class,fields= {
									@FieldResult(name="id", column="id"),
									@FieldResult(name="amount", column="amount"),
									@FieldResult(name="cardIssued", column="ci"),
									@FieldResult(name="dateOfOpening", column="dop"),
									@FieldResult(name="type", column="t"),
									@FieldResult(name="version", column="v"),
									@FieldResult(name="warranty", column="w")
							}
							)})
@SQLDelete(sql="Update account set \"Type\" = null where amount=? and version= ? ")
public class Account implements Serializable{
	@Id
	private int id;
	@ColumnDefault(value="500")
	private double amount;
	@Column( name= "\"Type\"")
	@Basic( fetch= FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private AccountType type;
	private LocalDateTime dateOfOpening;
	@Convert(converter=CardIssuedConverter.class)
	private CardIssued cardIssued;
	@Lob
	private Clob warranty;
	@Version
	@Type(type="dbtimestamp")
	private Date version;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	public LocalDateTime getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(LocalDateTime dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public CardIssued getCardIssued() {
		return cardIssued;
	}
	public void setCardIssued(CardIssued cardIssued) {
		this.cardIssued = cardIssued;
	}
	public Clob getWarranty() {
		return warranty;
	}
	public void setWarranty(Clob warranty) {
		this.warranty = warranty;
	}
	
	public String toString() {
		return this.getId()+ ", "+ this.getAmount();
	}
	public Date getVersion() {
		return version;
	}
	public void setVersion(Date version) {
		this.version = version;
	}
	

}
