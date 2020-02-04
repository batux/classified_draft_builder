package com.design.pattern.builder.model;

import java.util.List;

import com.design.pattern.builder.DraftBuilder;

public class ClassifiedDraft{
	
	private String title;
	private String description;
	private Double price;
	private List<? extends Option<?>> options;
	private List<Video> videos;
	private List<Image> images;
	private Location location;
	private Address address;
	
	private ClassifiedDraft(String title, String description, Double price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}

	public List<? extends Option<?>> getOptions() {
		return options;
	}

	public void setOptions(List<? extends Option<?>> options) {
		this.options = options;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "ClassifiedDraft [title=" + title + ", description=" + description + ", price=" + price + ", options="
				+ options + ", videos=" + videos + ", images=" + images + ", location=" + location + ", address="
				+ address + "]";
	}



	public static class ClassifiedDraftBuilder implements DraftBuilder<ClassifiedDraft>{

		private ClassifiedDraft classifiedDraft;
		
		public ClassifiedDraftBuilder(String title, String description, Double price) {
			this.classifiedDraft = new ClassifiedDraft(title, description, price);
		}
		
		public ClassifiedDraftBuilder options(List<? extends Option<?>> options) {
			this.classifiedDraft.setOptions(options);
			return this;
		}
		
		public ClassifiedDraftBuilder videos(List<Video> videos) {
			this.classifiedDraft.setVideos(videos);
			return this;
		}
		
		public ClassifiedDraftBuilder images(List<Image> images) {
			this.classifiedDraft.setImages(images);
			return this;
		}
		
		public ClassifiedDraftBuilder location(Location location) {
			this.classifiedDraft.setLocation(location);
			return this;
		}
		
		public ClassifiedDraftBuilder address(Address address) {
			this.classifiedDraft.setAddress(address);
			return this;
		}
		
		public ClassifiedDraft build() {
			return this.classifiedDraft;
		}
	}
}
