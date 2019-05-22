package mytest.bean;

import java.util.Set;

public class Department {

	private String name;

	private Person leader;

	private Set<Person> member;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getLeader() {
		return leader;
	}

	public void setLeader(Person leader) {
		this.leader = leader;
	}

	public Set<Person> getMember() {
		return member;
	}

	public void setMember(Set<Person> member) {
		this.member = member;
	}
}
