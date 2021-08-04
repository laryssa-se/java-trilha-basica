package ex1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String name;
	private LocalDate birthDate;
	private double height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void info() {
		System.out
				.println("Name: " + getName() + "\n" + "Birthday: " + getBirthDate() + "\n" + "Height: " + getHeight());
	}

	public int calculateAge() {
		LocalDate now = LocalDate.now();
		Period diff = Period.between(getBirthDate(), now);

		return diff.getYears();
	}
}
