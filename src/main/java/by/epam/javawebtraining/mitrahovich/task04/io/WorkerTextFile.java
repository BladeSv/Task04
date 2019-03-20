package by.epam.javawebtraining.mitrahovich.task04.io;

import static by.epam.javawebtraining.mitrahovich.task04.util.PropertiesManager.getInputTextFileName;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WorkerTextFile {

	private static String inputTexFileName = getInputTextFileName();

	public WorkerTextFile() {
		// TODO Auto-generated constructor stub
	}

	public static void write(String string, String fileName) {
		try (DataOutputStream os = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String read() {

		StringBuilder sb = null;
		try (BufferedReader is = new BufferedReader(new FileReader(inputTexFileName))) {
			sb = new StringBuilder();
			while (is.ready()) {
				sb.append(is.readLine());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sb.toString();
	}
}
