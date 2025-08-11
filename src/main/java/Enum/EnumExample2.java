package Enum;

//Enum using constructor and getter method

enum Status {
	Created(200), Ok(200), NoContent(201), NotFound(404);

	private int statusCode;

	Status(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}
}

public class EnumExample2 {

	public static void main(String[] args) {

		for (Status s : Status.values()) {

			System.out.println("Status: " + s + " StatusCode: " + s.getStatusCode());
		}

	}

}
