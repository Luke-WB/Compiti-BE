package com.cOmpito110423.cOmpito110423;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import conguration.Bevande;
import conguration.ConfigurationTest;
import conguration.Esercizio2F;
import conguration.Franchise;
import conguration.Pizza;

@SpringBootApplication
public class COmpito110423Application {

    public static void main(String[] args) {
	SpringApplication.run(COmpito110423Application.class, args);
	System.out.println("LE PIZZE CHE PUOI ACQUISTARE SONO: ");
	configWith_Beans2();
	System.out.println("GLI INGREDIENTI CHE PUOI AGGIUNGERE SONO: ");
	configWith_Beans1();
	System.out.println("LE BIBITE CHE PUOI ACQUISTARE SONO: ");
	configWith_Beans3();
	System.out.println("I GADGET CHE PUOI ACQUISTARE SONO: ");
	configWith_Beans4();
    }

    public static void configWith_Beans1() {
	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);
	// Recupero Bean
	Esercizio2 t1 = (Esercizio2) appContext.getBean("salami");
	Esercizio2 t2 = (Esercizio2) appContext.getBean("prosciutto");
	Esercizio2 t3 = (Esercizio2) appContext.getBean("pineapple");
	Esercizio2 t4 = (Esercizio2) appContext.getBean("cheese");
	Esercizio2 t5 = (Esercizio2) appContext.getBean("onion");
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	System.out.println(t4);
	System.out.println(t5);

	// System.out.println(t1.saluta());

	appContext.close();

    }

    public static void configWith_Beans2() {
	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(Pizza.class);
	esercizio2p t1 = (esercizio2p) appContext.getBean("margherita_pizza");
	esercizio2p t2 = (esercizio2p) appContext.getBean("hawaiian_pizza");
	esercizio2p t3 = (esercizio2p) appContext.getBean("salami_pizza");
	esercizio2p t4 = (esercizio2p) appContext.getBean("family_size_for_pizza");
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	System.out.println(t4);
	appContext.close();
    }

    public static void configWith_Beans3() {
	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(Bevande.class);
	Esercizio2B t1 = (Esercizio2B) appContext.getBean("lemonade");
	Esercizio2B t2 = (Esercizio2B) appContext.getBean("water");
	Esercizio2B t3 = (Esercizio2B) appContext.getBean("wine");
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	appContext.close();
    }

    public static void configWith_Beans4() {
	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(Franchise.class);
	Esercizio2F t1 = (Esercizio2F) appContext.getBean("mug");
	Esercizio2F t2 = (Esercizio2F) appContext.getBean("shirt");
	System.out.println(t1);
	System.out.println(t2);
	appContext.close();
    }

}
