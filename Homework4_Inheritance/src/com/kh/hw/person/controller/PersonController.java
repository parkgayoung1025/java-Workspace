package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int[] arr = new int[2]; // 0 -> 현재 저장된 학생수, 1 -> 현재 저장된 사원수

		int count = 0;
		for (Student std : s) {
			if (std != null) {
				arr[0] = ++count;
			}
		}
		count = 0;
		for (Employee emp : e) {
			if (emp != null) {
				arr[1] = ++count;
			}
		}
		return arr;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}

	public Student[] printStudent() {
		return s;

	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}

	public Employee[] printEmployee() {
		return e;

	}
}
