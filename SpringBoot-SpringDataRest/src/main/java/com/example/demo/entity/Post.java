package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "post")
public class Post {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "post_id")
	private long id;
	@Column(name = "post_desc")
	private String postDescription;
	@Column(name = "post_date")
	private Date postDate;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Comment> comments;
}
