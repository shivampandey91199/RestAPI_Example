package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145, "java", "This course contains basic info about java"));
		list.add(new Course(146, "Spring boot ", "creating rest api using spring boot"));

	}

	@Override
	public List<Course> getAllCourse() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {

		Course c = null;
		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;

	}

}
