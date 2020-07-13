package methods.z4konvertorMetrickihJedinica;

import java.time.LocalDate;
import java.util.Date;

public class MyImmutableClass {

	private String name;
	private LocalDate dateOfBirth;
	private Date date;
	private Integer muda;

	public MyImmutableClass(String name, LocalDate dateOfBirth, Date date, Integer muda) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.date = date;
		this.muda = muda;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Date getDate() {
		return new Date(this.date.getDate());
	}

	public Integer getMuda() {
		return muda;
	}

}
