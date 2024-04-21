package com.hibernate1.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
	static StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
	static Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	static SessionFactory build=null;
	public static SessionFactory getSessionFactory() {
		if (build==null) {
			build=meta.getSessionFactoryBuilder().build();
		}
		return build;
		
	}
}
