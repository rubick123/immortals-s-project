package edu.zut.cs.sowtfare.awm.admin.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-04-28T20:09:33.759+0800")
@StaticMetamodel(Group.class)
public class Group_ {
	public static volatile SingularAttribute<Group, String> name;
	public static volatile SetAttribute<Group, CustomerServicer> users;
}

