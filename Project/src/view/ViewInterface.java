package view;

import java.util.Scanner;

public interface ViewInterface {
	public void allPeople();

	public void selectView(Scanner sc);

	public void updateView(Scanner sc);

	public void insertView(Scanner sc);

	public void deleteView(Scanner sc);
}
