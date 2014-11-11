package ch08.sec05.serializable;

/*��Student��������д��object.dat*/
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestWriteObject {
	public static void main(String args[]) {
		try {
			ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream(
					"object.dat"));
			Student s = new Student("����", 2003001, 172);
			f.writeObject(s);
			s.output();
			f.close();
		} catch (Exception e) {
			System.err.println("�����쳣:" + e);
			e.printStackTrace();
		}
	}
}

