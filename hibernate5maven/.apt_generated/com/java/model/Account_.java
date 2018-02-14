package com.java.model;

import java.time.LocalDateTime;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static volatile SingularAttribute<Account, Double> amount;
	public static volatile SingularAttribute<Account, Integer> id;
	public static volatile SingularAttribute<Account, AccountType> type;
	public static volatile SingularAttribute<Account, CardIssued> cardIssued;
	public static volatile SingularAttribute<Account, Date> version;
	public static volatile SingularAttribute<Account, LocalDateTime> dateOfOpening;

}

