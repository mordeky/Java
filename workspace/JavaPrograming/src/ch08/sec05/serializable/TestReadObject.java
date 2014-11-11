package ch08.sec05.serializable;

/*��object.dat����Student��������*/
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadObject {
	public static void main(String args[]) {
		try {
			ObjectInputStream f = new ObjectInputStream(new FileInputStream(
					"object.dat"));
			Student s = (Student) (f.readObject());
			s.output();
			f.close();
		} catch (Exception e) {
			System.err.println("�����쳣:" + e);
			e.printStackTrace();
		}
	}
}
