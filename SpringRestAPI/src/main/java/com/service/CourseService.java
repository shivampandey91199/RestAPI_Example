package com.service;

import java.util.List;

import com.Entity.Course;

public interface CourseService {

	
	
	public List<Course> getAllCourse();
	
	public Course getCourse(long courseId );
	
	public Course addCourse(Course course);
}
