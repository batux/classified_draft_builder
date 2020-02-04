package com.design.pattern.builder;

import java.util.Arrays;

import com.design.pattern.builder.model.Address;
import com.design.pattern.builder.model.ClassifiedDraft;
import com.design.pattern.builder.model.Image;
import com.design.pattern.builder.model.Location;
import com.design.pattern.builder.model.Option;
import com.design.pattern.builder.model.Video;

public class Main {

	public static void main(String[] args) {
		
		// Classified draft with images, options
		ClassifiedDraft classifiedDraftWithExtraFields = new ClassifiedDraft.ClassifiedDraftBuilder("sahibinden'deki en uygun BMW 520 :)", "Çok temiz araç! Kazasız tertemiz.", 300000.0)
				.address(null)
				.images(Arrays.asList(new Image("1.jpg", "https://www.sahibinden.com/image/1.jpg"),
									  new Image("2.jpg", "https://www.sahibinden.com/image/2.jpg"),
									  new Image("3.jpg", "https://www.sahibinden.com/image/3.jpg")))
				.videos(Arrays.asList(new Video("bmw_520.mov", "https://www.sahibinden.com/image/3.jpg")))
				.options(Arrays.<Option<?>>asList(new Option<Double>("transmission", 19.9), 
												  new Option<Integer>("ccm", 1000),
												  new Option<String>("gearType","Manual")))
				.address(new Address("İstanbul", "Ataşehir", "Bahçe Mahallesi"))
				.location(new Location(34.45454444, 27.3453453))
				.build();
		
		
		System.out.println("--- Classified with extra fields ---");
		System.out.println(classifiedDraftWithExtraFields.toString());
		
		
		
		// Classified draft with basic fields
		ClassifiedDraft classifiedDraftWithBasicFields = new ClassifiedDraft.ClassifiedDraftBuilder("Java Gurusu'ndan Ders :)", "Uzman Java Eğitmeni, JSP, JSF, Spring, Hibernate", 19999.9)
				.build();
		
		System.out.println("--- Classified with basic fields ---");
		System.out.println(classifiedDraftWithBasicFields.toString());
	}

}
